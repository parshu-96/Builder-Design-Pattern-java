import user.User;

public class Main {
    public static void main(String[] args) {
        try {
            User user = new User.UserBuilder()
                    .firstName("Parshuram")
                    .lastName("Mahindrakar")
                    .email("abc@example.com")
                    .age(29)
                    .build();
            System.out.println(user);
        }
        catch (Exception e)
        {
            System.out.println("Received an exception while creating Object of user class :\n" + e.getMessage());
            //e.printStackTrace();
        }

    }
}