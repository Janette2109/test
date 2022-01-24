public class Cat {
    double weight;
    String name;
    int age;
    String color;

    public Cat() {
        weight = 3000;
        name = "Barsik";
        age = 1;
        color = "Green";
    }

    public Cat(double weight1, String name1, int age1, String color1) {
        weight = weight1;
        name = name1;
        age = age1;
        color = color1;
    }
    void Vivod(){
        System.out.println("Имя: "  + name + " Вес: "  + weight + "г Возраст: "  + age + "год" + " Цвет: "  + color);
    }
    void pee(){
        weight-= 100;
    }
    void okraska(String colorNew){
        color = colorNew;
    }
    public static void main(String[] args) {
        Cat Barsik = new Cat();
        Cat bigCat = new Cat(5500, "Murka", 2, "Grey");
        Cat Pupsik = new Cat(8000, "Barsik", 5, "Pink");
        Pupsik.okraska("Red");
        bigCat.okraska("Black");
        Barsik.Vivod();
        bigCat.Vivod();
        Pupsik.Vivod();
    }
    }




