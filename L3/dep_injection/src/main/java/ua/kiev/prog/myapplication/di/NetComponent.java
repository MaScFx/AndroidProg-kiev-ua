package ua.kiev.prog.myapplication.di;

import javax.inject.Singleton;

import dagger.Component;
import ua.kiev.prog.myapplication.MainActivity;

@Singleton
@Component(modules={NetModule.class})
public interface NetComponent {
   void inject(MainActivity activity);
}