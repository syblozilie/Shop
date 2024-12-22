import java.util.Scanner;
public class Shop {

    private static Clothes[] clothesArray;
    public Shop(int size){
        clothesArray=new Clothes[size];
    }




    Scanner input=new Scanner(System.in);


    public static void addClothes(int index, Clothes clothes) {

        if (index >= 0 && index < clothesArray.length) {
            clothesArray[index] = clothes;
        } else {
            System.out.println("Index out of bounds.");
        }


    }

    public static class Main{
        public static void main(String[] args){
            System.out.println("VipClothesShop");
            System.out.println("Merchandise:");
            Shop shop=new Shop(6);
            Clothes clothes1=new Clothes("clothes1:coat","China","leather","black","S,M,L,XL",1000);
            Clothes clothes2=new Clothes("clothes2:jeans","Japan","denim","blue","S,M,L,XL,XXL",200);
            Clothes clothes3=new Clothes("clothes3:skirt","America","cotton","white","S,M,L",150);
            Clothes clothes4=new Clothes("clothes4:cardigan","China","wool","yellow","M,L,XL",1000);
            Clothes clothes5=new Clothes("clothes5:trousers","China","cotton","blank","M,L,XL,XXL",1000);
            Clothes clothes6=new Clothes("clothes6:dress","England","silk","blank","S,M,L,XL",1000);

            Shop.addClothes(0,clothes1);
            Shop.addClothes(1,clothes2);
            Shop.addClothes(2,clothes3);
            Shop.addClothes(3,clothes4);
            Shop.addClothes(4,clothes5);
            Shop.addClothes(5,clothes6);

            System.out.println(Shop.clothesArray[0].toString());
            System.out.println(Shop.clothesArray[1].toString());
            System.out.println(Shop.clothesArray[2].toString());
            System.out.println(Shop.clothesArray[3].toString());
            System.out.println(Shop.clothesArray[4].toString());
            System.out.println(Shop.clothesArray[5].toString());

            shop.checkBestClothes();
            shop.serve();

        }
    }

    public void checkBestClothes(){
        System.out.print("Enter your height(Unit:meter):");
        float height= input.nextFloat();
        System.out.print("Enter your weight(Unit:kg):");
        double weight=input.nextDouble();
        double exponent=weight/(height*height);
        System.out.print("According to the system's calculations, your best size is:");

        if(height<=1.53){
            if(exponent<29.9){
                System.out.println("S");
            }
            else if(exponent>=29.9){
                System.out.println("M");
            }
        }
        else if(height>1.57&&height<=1.63){
            if (exponent<18.5) {
                System.out.println("S");
            }
            else if(exponent>=18.5&&exponent<24.9) {
                System.out.println("M");
            }
            else if(exponent>=24.9&&exponent<29.9){
                System.out.println("L");
            }
            else if(exponent>=29.9){
                System.out.println("XL");
            }
        }

        else if(height>1.63&&height<=1.67){
            if (exponent<18.5){
                System.out.println("M");
            }
            else if(exponent>=18.5&&exponent<24.9) {
                System.out.println("L");
            }
            else if(exponent>=24.9&&exponent<29.9){
                System.out.println("XL");
            }
            else if(exponent>=29.9){
                System.out.println("2XL");
            }
        }
        else if(height>1.67&&height<=1.73){
            if (exponent<18.5){
                System.out.println("L");
            }
            else if(exponent>=18.5&&exponent<24.9) {
                System.out.println("XL");
            }
            else if(exponent>=24.9&&exponent<29.9){
                System.out.println("2XL");
            }
            else if(exponent>=29.9){
                System.out.println("3XL");
            }
        }
        else if(height>1.73&&height<=1.80){
            if (exponent<18.5){
                System.out.println("XL");
            }
            else if(exponent>=18.5&&exponent<24.9) {
                System.out.println("2XL");
            }
            else if(exponent>=24.9){
                System.out.println("3XL");
            }
        }
        else if(height>1.80){
            if (exponent<18.5) {
                System.out.println("2XL");
            }
            else if(exponent>=18.5) {
                System.out.println("3XL");
            }
        }


    }


    public void serve(){
        System.out.print("What clothes would you want to choice?:");
        int number1= input.nextInt();
        System.out.print("Do you still want to buy?If you want to continue buying, please write one, do not want to continue buying, please write two:");
        int choice= input.nextInt();
        if(choice == 1){
            System.out.print("What clothes would you want to choice?:");
            int number2= input.nextInt();
            System.out.print("Do you still want to buy?If you want to continue buying, please write one, do not want to continue buying, please write two:");
            int choice2= input.nextInt();
            if(choice2 == 1){
                System.out.print("What clothes would you want to choice?:");
                int number3= input.nextInt();
                System.out.print("OK,In the member store, you can choose a maximum of three pieces of clothing,I'll settle your bill now......");
            }
            else if (choice2==2) {
                System.out.print("OK,I'll settle your bill now......");
            }
            else{
                System.out.print("Sorry, the language you entered does not conform to our requirements.");
            }
        }
        else if (choice==2) {
            System.out.print("OK,I'll settle your bill now......");
        }
        else{
            System.out.print("Sorry, the language you entered does not conform to our requirements.");
        }
        System.out.print("Sorry, due to the breakdown of the checkout system, we can not pay for you, please look forward to it......");
    }
}



