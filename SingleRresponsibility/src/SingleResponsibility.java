public class SingleResponsibility {

    public static void main(String[] args) {
        UserAuthentication user = new UserAuthentication();
        EmailService email = new EmailService();

        user.login(null, null);
        email.sendEmail(null, null, null);
    }

}
