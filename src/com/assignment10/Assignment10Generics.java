package com.assignment10;

public class Assignment10Generics {
    public static void main(String[] args) {
        SList<Integer> sList = new SList<>();
        ListIterator<Integer> listIterator = new
                ListIterator<>(sList);

        listIterator.insert(10);
        listIterator.insert(20);
        listIterator.insert(30);
        listIterator.insert(40);
        listIterator.Delete(40);
        listIterator.Delete(50);
        System.out.println(listIterator);

    }

}
