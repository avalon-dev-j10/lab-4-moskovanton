package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import java.util.Date;
import ru.avalon.java.dev.j10.labs.*;

public class Main {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = new String[20];
 
            strings[7] = "fqfqwfqw";
            strings[8] = "jhgjty7";
            strings[17] = "agfdhj5";
            strings[10] = "sagfdhj6";
            strings[9] = "fgjt";
            strings[12] = "aaa";
            strings[11] = "a2e4at5";
            strings[1] = "dfbjfgj";
            strings[2] = "poiujhg";
            strings[3] = "145rrt";
            strings[14] = "4567gfhf";
            strings[16] = "some string 3";
            strings[15] = "some string 1";
            strings[13] = "some string 2";
            strings[4] = "ggggghr55y";
            strings[0] = "some string 13tteg";
            strings[5] = "some string 2gdh";
            strings[18] = "some string 3s45";
            strings[6] = "some string 122t";
            strings[19] = "some string 21";
            System.out.println("------------Before sorting-----------");
            for(String s : strings) System.out.println(s);
	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = new Human[20];
            persons[0] = new Human("Phil", "Johns", new Date(999999999));
            persons[1] = new Human("Phil", "Johns", new Date(11));
            persons[2] = new Human("Adam", "Johnson");
            persons[3] = new Human("Nate", "Diaz");
            persons[4] = new Human("Phil", "Johnson");
            persons[5] = new Human("Tom", "Diaz");
            persons[6] = new Human("Jake", "Johns");
            persons[7] = new Human("Tom", "Johnson");
            persons[8] = new Human("Mike", "Diaz");
            persons[9] = new Human("Phil", "Edwards");
            persons[10] = new Human("Adam", "Edwards");
            persons[11] = new Human("Nate", "Edwards");
            persons[12] = new Human("Jerry", "Johns");
            persons[13] = new Human("Jerry", "Johnson");
            persons[14] = new Human("Jerry", "Diaz");
            persons[15] = new Human("Oliver", "Johns");
            persons[16] = new Human("Oliver", "Johnson");
            persons[17] = new Human("Oliver", "Diaz");
            persons[18] = new Human("Poll", "Johns");
            persons[19] = new Human("Poll", "Johns");
            System.out.println("-----------Before sorting------------");
            for(Person s1 : persons) System.out.println(s1.getName() + " " + s1.getBirthDate());
        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new Sorting();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new EdibleComparator();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);
        System.out.println("-------------After ascending sorting----------");
        for(Person s1 : persons) System.out.println(s1.getName() + " " + s1.getBirthDate());
        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);
        System.out.println("------------After ascending sorting-----------");
        for(String s : strings) System.out.println(s);
        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
        System.out.println("-----------After descending sorting------------");
        for(String s : strings) System.out.println(s);
    }
}
