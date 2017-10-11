package ua.kiev.prog.myapplication.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ua.kiev.prog.myapplication.http.Http;
import ua.kiev.prog.myapplication.http.IHttp;

@Module
public class NetModule {

    @Singleton
    @Provides
    public IHttp getHttp(){
        return new Http();
    }
}
