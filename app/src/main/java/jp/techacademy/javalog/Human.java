package jp.techacademy.javalog;

import android.util.Log;

/**
 * Created by takayuki on 16/07/28.
 */
 class Human extends Animal implements Thinkable {
    static String Animal = "人";
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void say(){
        String hobby = "プログラミング";
        Log.d("javatest","私は" + hobby + "について考える");


    }

    @Override
    public void think() {
        Log.d("javatest","私の名前は" + this.name + "で、年齢は" + this.age + "歳です");

    }
}
