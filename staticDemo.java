class staticDemo{

static int number;

static {
   number = 10;
    System.out.println("Static block");
}

static void show(){
  System.out.println("Number : " + number);
}

public static void main(String args[]){
   staticDemo.show();
 }
}
