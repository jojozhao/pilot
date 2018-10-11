package com.pilot.stack;

//基於數組實現的順序棧
public class ArrayStack{
    private String[] items;//數組
    private int count;     //棧中元素個數
    private int n;         //棧的大小

    //初始化數組，申請一個大小為n的數組空間
    public ArrayStack(int n){
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    //入棧操作
    public boolean push(String item){
        //數組空間不夠了，直接反回false，入棧失敗。
        if(count == n) return false;
        // 將item 放到下標為count的位置，并且 count 加一
        items[count] = item;
        ++count;
        return true;
    }

    public String pop(){
        //棧爲空，直接返回null
        if(count == 0) return null;
        //返回下標為count-1的數組元素，并且棧中元素個數count減一
        String tmp = items[count-1];
        --count;
        return tmp;

    }
}