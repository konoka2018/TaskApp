package jp.techacademy.konoka.fujiwara.taskapp;

import java.io.Serializable;
import java.util.Date;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
//プライマリーキーとは主キーとも呼ばれ、データーベースの一つのテーブルの中でデータを唯一的に確かめるための値

//Serializableとはデータを丸ごとファイルに保存したり、
//TaskAppでいうと別のActivityに渡すことができるようにすることです。
public class Task extends RealmObject implements Serializable {
    private String title; // タイトル
    private String contents; // 内容
    private Date date; // 日時
    private String category;  // ＊＊＊＊＊新規追加＊＊＊＊＊

    // id をプライマリーキーとして設定
    @PrimaryKey
    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {  // ＊＊＊＊＊新規追加＊＊＊＊＊
        return category;
    }

    public void setCategory(String category) {  // ＊＊＊＊＊新規追加＊＊＊＊＊
        this.category = category;
    }

}