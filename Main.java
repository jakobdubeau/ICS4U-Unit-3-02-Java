/**
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*
*/

final class Main {

    /**
    * Constant.
    */
    public static final int ELEVEN = 11;

    /**
    * Constant.
    */
    public static final int SEVEN = 7;

    /**
    * Prevents instantiation.
    *
    *  @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The stack program.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        final MrCoxallStack stack = new MrCoxallStack();

        System.out.println("The initial stack is empty.\n");
        stack.showStack();

        System.out.println("Adding 11.");
        stack.push(ELEVEN);
        stack.showStack();

        System.out.println("Adding 7.");
        stack.push(SEVEN);
        stack.showStack();

        System.out.println("Popping top number.");
        stack.pop();
        stack.showStack();

        System.out.println("\nDone.");
    }
}
