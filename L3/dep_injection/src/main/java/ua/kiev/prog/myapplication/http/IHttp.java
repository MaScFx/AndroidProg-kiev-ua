package ua.kiev.prog.myapplication.http;

import ua.kiev.prog.myapplication.model.GeoIP;

public interface IHttp {
    void getDataFromServer(Http.Callback<GeoIP> callback);
}
