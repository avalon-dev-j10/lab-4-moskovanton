package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting implements Sort{
    //Выполняет сортировку переданного массива объектов.
    public void sort(Object[] array){
        if(array instanceof Comparable[]){
            sort((Comparable[]) array);
        }
    } 
    //Выполняет сортировку массива сравниваемых объектов.
    public void sort(Comparable[] array){
       for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i].compareTo(array[j])) > 0) {
                    Comparable temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        } 
    }
    /*Выполняет сортировку массива объектов с
     * использованием переданного объекта типа
     * {@link Comparator}.*/
    public void sort(Object[] array, Comparator comparator){
        Arrays.sort(array, comparator.reversed());
    } 
}