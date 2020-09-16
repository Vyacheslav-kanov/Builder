public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday(){
        age++;
    }

    public boolean hasAddress(){
        if(!(address == null)) return true;
        else return false;
    }

    public boolean hasAge(){
        if(age == 0) return false;
        else return true;
    }

    private String toStringAge(){
        if(hasAge()) return age + "";
        return "Возраст скрыт";
    }

    private String toStringAddress(){
        if(hasAddress()) return address;
        return "Адрес скрыт";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = " + name + ", " +
                " surname = " + surname + ", " +
                " age = " + toStringAge() + ", " +
                " address = " + toStringAddress() + ".}";
    }
}
