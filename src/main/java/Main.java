public class Main {

    public static void main(String[] args) {

        Person student = new PersonBuilder()
                .setName("Anton")
                .setSurname("Konopatiy")
                .setAge(20)
                .setAddress("Mosscow")
                .build();
        System.out.println(student);

        Person child = new PersonBuilder()
                .setName("Леша")
                .setSurname("")
                .setAge(5)
                .newChildBuilder();
        System.out.println(child);

        child.happyBirthday();
        System.out.println(child);

        try{
            Person failNameExample = new PersonBuilder().build();
            System.out.println(failNameExample);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

        try{
            Person failAgeExample = new PersonBuilder()
                    .setName("Антошка")
                    .setSurname("Картошка")
                    .setAge(-100)
                    .build();
            System.out.println(failAgeExample);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
