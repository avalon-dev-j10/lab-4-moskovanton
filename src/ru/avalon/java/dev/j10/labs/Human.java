package ru.avalon.java.dev.j10.labs;

import java.util.Date;

public class Human implements Person {
    private String name;    //имя
    private String surname; //фамилия
    private Date birthday;  //дата рожденния

    /*  TODO (Замечание№1 ЛР№4)
        - Место типа Date лучше используй LocalDate, с ним проще работать!
    */

    /**
     * Возвращает имя человека.
     *
     * @return имя человека в виде строки
     */
    public String getName(){
        return name + " " + surname;
    }
    /**
     * Возвращает дату рождения человека.
     *
     * @return дата рождения в виде экземпляра типа
     * {@link Date}
     */
    public Date getBirthDate(){
        return birthday;
    }
    //Сравнение по именам, если совпадают, то по датам рождения
    public int compareTo(Person o) {
        Human human = (Human) o;
        int result = getName().compareTo(human.getName());
        if (result != 0) {
            return result;
        }
        result = getBirthDate().compareTo(human.getBirthDate());
        if (result != 0) {
            return result;
        }
        return 0;
    }
    //Полный конструктор
    public Human(String name, String surname, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }
    //Конструктор без даты рождения
    public Human(String name, String surname) {
        this(name, surname, new Date(458946924));
    }
}