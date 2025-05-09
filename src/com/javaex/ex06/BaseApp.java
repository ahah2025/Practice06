package com.javaex.ex06;

public class BaseApp {

    public static void main(String[] args) {

        Base base = new MyBase();
        base.service("낮");
        base.service("밤");
        base.service("오후");
    }

}


/*
낮에는 열심히 수업듣자
밤에는 숙면					(2)
오후도 낮과 마찬가지로 공부해야 합니다.낮에는 열심히 수업듣자
밤에는 숙면						(3)	
오후도 낮과 마찬가지로 공부해야 합니다.낮에는 열심히 수업듣자
밤에는 숙면
오후도 낮과 마찬가지로 공부해야 합니다.
*/