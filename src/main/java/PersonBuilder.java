public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name){
        if(name.equals(null)) throw new IllegalArgumentException("Пустое поле 'Name' ");
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname){
        if(surname.equals(null)) throw  new IllegalArgumentException("Пустое поле 'Surname'");
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age){
        if(age <= 0) throw new IllegalArgumentException("Некоректно введен возраст");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address){
        this.address = address;
        return this;
    }

    public Person build(){
        if(name == null) throw new IllegalArgumentException("Не заполнено поле 'Name'");
        if(surname == null) throw new IllegalArgumentException("Не заполнено поле 'Surname'");
        return new Person(name, surname, age, address);
    }

    public Person newChildBuilder(){
        if(age >= 14) throw new IllegalArgumentException("Ребенком являеться до 14 лет");
        return new Person(name, surname, age);
    }
}
