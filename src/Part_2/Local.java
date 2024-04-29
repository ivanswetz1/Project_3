package Part_2;

public class Local {
    private int LocalVariable = 100;

    void LocalMethod() {
        class LocalClass {
            void print() {
                System.out.println("Local variable: " + LocalVariable);
            }
        }

        LocalClass local = new LocalClass();
        local.print();
    }
}
