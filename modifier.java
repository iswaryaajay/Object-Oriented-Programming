/*
 * Comments
 * Famous Foods
 * Indian
 * Arabian
 * Canada
 * USA
 */

package moodifier; /* Package */
import java.util.*; /* Import statements */
class Hotlels {  /* Main class */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); /* Scanner class */
        System.out.println("1.A1 Hotel  2.Kavin Hotel  3.AJ Hotel");
        System.out.println("Choose your hotel");
        final int choose = scanner.nextInt(); /* Final */
        System.out.println("1.IndianFoods  2.CanadaFoods  3.ArabianFoods  4.USAFoods");
        System.out.println("1.IndianSweets  2.CanadaSweets  3.ArabianSweet  4.USASweets");
        System.out.println("enter your choice");
        final int choice = scanner.nextInt(); /* Final */
        final int chef = scanner.nextInt(); /* Final */
        System.out.println("1.GrandMaster Chef  2.Master Chef  3.Chef");
        System.out.println("choose your chef to cook your food");
        SpecialFoods specialfoods = new SpecialFoods(); /* Object Creation */
        SpecialSweets specialsweets = new SpecialSweets();
        Encapsulation encapsulation = new Encapsulation();
        Polymorphism polymorphism = new Polymorphism();
        System.out.println("enter your choice:"+"1.Dinner  2.Lunch");
        encapsulation.orderlist();
        switch(choice){ /* switch Case */
            case 1:
                polymorphism.work();
                specialfoods.indianFood();
                specialsweets.indianSweet();
               break;
            case 2:
                polymorphism = new Poly1();
                polymorphism.work();
                specialfoods.canadaFood();
                specialsweets.canadaSweet();
                break;
            case 3:
                polymorphism = new Poly2();
                polymorphism.work();
                specialfoods.arabianFood();
                specialsweets.arbianSweet();
                break;
            case 4:
                specialfoods.USAFood();
                specialsweets.USASweet();
                break;
            default:
                System.out.println("choose a correct option");
        }
        }
}
abstract class Foods{ /* Abstract class */

    abstract void indianFood();

    abstract void canadaFood();

    abstract void arabianFood();

    abstract void USAFood();
}
class SpecialFoods extends Foods{ /* inheritance */
    void indianFood() {
        System.out.println("Briyani is a special food for indian");
    }

    void canadaFood() {
        System.out.println("Poutine is a special food for canada");
    }

    void arabianFood() {
        System.out.println("shawarma is a special food for arabian");
    }

    void USAFood() {
        System.out.println("cheeseburger is a special food for USA");
    }

}
class SpecialSweets extends SpecialFoods{ /* Inheritance */

    void indianSweet() {
        System.out.println("Gulab jamun is a special sweet for indian");
    }

    void canadaSweet() {
        System.out.println("Butter tarts is a special sweet for canada");
    }

    void arbianSweet() {
        System.out.println("Halva is a special sweet for arabian");
    }

    void USASweet() {
        System.out.println("Cheesecake is a special sweet for USA");
    }

}
class Polymorphism{ /* Polymorphism */

    void work(){
        System.out.println("GrandMaster Chef");
    }

}
class Poly1 extends Polymorphism{

    void work(){
        System.out.println("Master Chef");
    }

}
class Poly2 extends Polymorphism{

    void work(){
        System.out.println("Chef");
    }

}
class Encapsulation { /* Encapsulation */

    Scanner sc = new Scanner(System.in);
    final int order = sc.nextInt();/* Final */
    private String foodorder = sc.nextLine(); /* Private */

    public String getFoodorder() {
        return foodorder;
    }

    public void setFoodorder(String foodorder) {
        this.foodorder = foodorder;
    }

    public void orderItem() {
        System.out.println(order);
    }

    public void orderlist() {
        if (order == 1) {

            System.out.println("Dinner Foods List:" + "1.pongal\n 2.poori\n 3.dhosai\n 4.idly");
            if (foodorder == "pongal" || foodorder == "poori" || foodorder == "dhosai" || foodorder == "idly") {

                System.out.println("your food is ordered");
        } else {
                System.out.println("your food is currently unavailable");
            }
        if (order == 2) {

                System.out.println("Lunch food list:" + "1.Briyani\n 2.Rice\n 3.amplet\n 4.matton");
                if (foodorder == "Briyani" || foodorder == "Rice" || foodorder == "amplet" || foodorder == "Matton") {

                    System.out.println("your food is ordered");
                } else {
                    System.out.println("your food is currently unavailable");
                }
            }
        }

    }
    interface Hotels { /* interface */

        abstract void A1Hotel();

        abstract void KavinHotel();

        abstract void AjHotel();
    }
    class Hotel1 implements Hotels {

        public final void A1Hotel() {
            System.out.println("A1 hotel Location: Kovilpatti");
        }

        public final void KavinHotel() {
            System.out.println("Kavin hotel Location: Sankarankovil");
        }

        public final void AjHotel() {
            System.out.println("Aj hotel Location: Thirunelveli");
        }
    }

}


