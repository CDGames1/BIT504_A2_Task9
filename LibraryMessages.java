// name - Chiricahua Dilloway
// Student ID - 5114506
// Assessment 2 BIT504

public class LibraryMessages {
    public static void showAll() {
        showWelcome();
        showOpeningHours();
        showBookService();
        showMemberService();
    }

    public static void showWelcome() {
        System.out.println("welcome to the local library");
    }

    public static void showOpeningHours() {
        System.out.println("opening hours are 9 am to 5 pm");
    }

    public static void showBookService() {
        System.out.println("books can be borrowed from the service desk");
    }

    public static void showMemberService() {
        System.out.println("members can borrow 1 book at a time");
    }
}
