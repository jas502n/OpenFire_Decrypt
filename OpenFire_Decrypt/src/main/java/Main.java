
import com.mytools.Blowfish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("__________________________________________");
        System.out.println("OpenFire 管理后台账号密码解密\n" +
                "encryptedPassword =>> 后台用户的密码\n" +
                "passwordKey =>> 安装生成的秘钥\n");

//        encryptedPassword:加密的密码
//        String encryptedPassword = "cef7d1faf10db55cdd43847c9869da627674cda780275756";
        Scanner sc = new Scanner(System.in);
        System.out.print("[+] encryptedPassword= ");
        String encryptedPassword = sc.nextLine();


        System.out.print("[+] passwordKey= ");
//        passwordKey 秘钥
//        String passwordKey = "QWMRc9f3X9t2BN0";
        String passwordKey = sc.nextLine();

        Blowfish blowFish = new Blowfish(passwordKey);
//        解密后明文密码
        String Password = blowFish.decryptString(encryptedPassword);
        System.out.println("[+] Password =>> " + Password);
    }
}