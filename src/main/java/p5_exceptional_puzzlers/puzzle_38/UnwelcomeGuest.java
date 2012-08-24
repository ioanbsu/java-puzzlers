package p5_exceptional_puzzlers.puzzle_38;

public class UnwelcomeGuest {
    public static final long GUEST_USER_ID = -1;

//    private static final long USER_ID; //todo; uncomment to see the puzzler effect

    static {
        //todo; uncomment to see the puzzler effect
        /* try {
            USER_ID = getUserIdFromEnvironment();
        } catch (IdUnavailableException e) {
            USER_ID = GUEST_USER_ID;
            System.out.println("Logging in as guest");
        }*/
    }

    private static long getUserIdFromEnvironment()
            throws IdUnavailableException {
        throw new IdUnavailableException(); // Simulate an error
    }

    public static void main(String[] args) {
//        System.out.println("User ID: " + USER_ID);//todo; uncomment to see the puzzler effect
    }
}

class IdUnavailableException extends Exception {
}
