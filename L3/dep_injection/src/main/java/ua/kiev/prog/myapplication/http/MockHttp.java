package ua.kiev.prog.myapplication.http;

import com.google.gson.Gson;

import ua.kiev.prog.myapplication.model.GeoIP;

public class MockHttp  implements IHttp {

    private static Http http = new Http();

    public static Http getInstance() {
        return http;
    }

    @Override
    public void getDataFromServer(Http.Callback<GeoIP> callback) {
        Gson gson = new Gson();
        GeoIP geoIP = gson.fromJson(json, GeoIP.class);
        callback.onData(geoIP);
    }

    private String json = "{\"ip\":\"178.151.124.194\",\"country_code\":\"UA\",\"country_name\":\"Ukraine\",\"region_code\":\"30\",\"region_name\":\"Kyiv City\",\"city\":\"Kiev\",\"zip_code\":\"\",\"time_zone\":\"Europe/Kiev\",\"latitude\":50.4333,\"longitude\":30.5167,\"metro_code\":0}";
}
