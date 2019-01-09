package jp.techacademy.konoka.fujiwara.taskapp;

import android.app.Application;
import io.realm.Realm;

//Applicationクラスを継承したTaskAppクラスを作成
public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this); //Realmを初期化
    }
}

