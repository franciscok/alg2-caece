package com.caece.ejercicio6;

public class Main {

    public static void main(String[] args) {

        Archivo f = new Archivo();

        f.init(80);

        Hour firstObjHour = new Hour(11, 22, 66 );
        Hour secondObjHour = new Hour(10, 15 , 12);

        Hour resultHour = new Hour ();

        firstObjHour.sumHours(firstObjHour, secondObjHour);

        resultHour = firstObjHour;

        resultHour.getTime();
    }
}
