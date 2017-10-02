package com.company;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by vasilii on 028 28.09.17.
 */
public class LRU {
    final static int maxCapacity=50;
    Map<Integer, String> ulrCash = new LRUmap<>(maxCapacity);

    public LRU() {
        fillChash();
        printUlrCash();
    }

    public void fillChash(){
        int i=1;
        while (ulrCash.size()<maxCapacity) {
            ulrCash.put(i, "User" + i++);
        }
    }

    public void printUlrCash(){
        int i=0;
        for(Map.Entry<Integer, String> pair: ulrCash.entrySet()){
            System.out.println(++i+" "+pair.getKey()+" "+pair.getValue() );
            pair.getKey();
            pair.getValue();
        }
    }
    public void getRandomAccess(){
        System.out.println("Start random access");
        for (int i=0; i<50000; i++){
            ulrCash.get(9);
            ulrCash.get(8);
            ulrCash.get(7);
            ulrCash.get(6);
            //ulrCash.get(new Random().nextInt(100));
        }
    }

    public void addUser(){
        ulrCash.put(200, "NewUser");
    }



}
