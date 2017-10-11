package ua.kiev.prog.myapplication.http;

import com.google.gson.Gson;

import java.io.IOException;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import ua.kiev.prog.myapplication.model.GeoIP;

public class Http implements IHttp {

    private final OkHttpClient client = new OkHttpClient();

    @Override
    public void getDataFromServer(final Callback<GeoIP> callback) {
        Flowable.just("http://freegeoip.net/json/")
                .subscribeOn(Schedulers.io())
                .map(new Function<String, GeoIP>() {
                    @Override
                    public GeoIP apply(@NonNull String s) throws Exception {
                        Request request = new Request.Builder()
                                .url(s)
                                .build();

                        try (Response response = client.newCall(request).execute()) {
                            String strResponse = response.body().string();
                            Gson gson = new Gson();
                            return gson.fromJson(strResponse, GeoIP.class);
                        }
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<GeoIP>() {
                    @Override
                    public void accept(GeoIP geoIP) throws Exception {
                        callback.onData(geoIP);
                    }
                });
    }


    public interface Callback<T> {
        void onData(T str);
    }
}
