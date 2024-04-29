package Part_2;

public class Main {
    public static void main(String[] args) {
        //Use of InnerClass
        Inner inner = new Inner();
        Inner.InnerClass innerClass = inner.new InnerClass();
        innerClass.print();

        //Use of LocalClass
        Local local = new Local();
        local.LocalMethod();

        //Anonymous class
        new Thread() {
            public void run() {
                System.out.println("Thread Running");
            }
        }.start();


    }
}
