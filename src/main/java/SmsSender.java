import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;



public class SmsSender {

    public static final String ACCOUNT_SID = "ACdaf19674afead22bed48ec654801875e";
    public static final String AUTH_TOKEN = "93282876483100b92cb74014443b75f8";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("+12063198449"), new PhoneNumber("+12065651773"), "Hello There").create();

        System.out.println(message.getSid());
    }
}