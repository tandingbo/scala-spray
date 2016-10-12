import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tanbobo on 2016/10/12.
 */
public class test {

    public static void main(String[] args) {
        double money = 1;
        System.out.println(chcekMoney("100.00"));
    }

    /**
     * 检查输入充值金额(只能是正整数或小数点后一位为0的小数)
     *
     * @param value
     * @return
     */
    private static boolean chcekMoney(String value) {
        String regex = "^\\+?[1-9][0-9]*(\\.[0]+)?$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(value);
        return m.matches();
    }
}
