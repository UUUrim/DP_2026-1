package hw.ch05;

public class Main {
    public static void main(String[] args) {
        System.out.println("컴퓨터공학전공 이예서");

        // System.out.println("========== 방식 1: Static Initializer ==========");
        // LoggerStaticInit logger1a = LoggerStaticInit.getInstance();
        // LoggerStaticInit logger1b = LoggerStaticInit.getInstance();

        // logger1a.log("Static Message 1");
        // logger1b.log("Static Message 2");

        // if (logger1a == logger1b) {
        //     System.out.println("O 동일한 인스턴스");
        // } else {
        //     System.out.println("X 다른 인스턴스");
        // }

        // System.out.println("\n========== 로그 출력 1 ==========");
        // System.out.println("[LoggerStaticInit 로그]");
        // System.out.println(logger1a.getLog());


        // System.out.println("\n========== 방식 2: Synchronized Lazy ==========");
        // LoggerSynchronizedLazy logger2a = LoggerSynchronizedLazy.getInstance();
        // LoggerSynchronizedLazy logger2b = LoggerSynchronizedLazy.getInstance();

        // logger2a.log("Synchronized Message 1");
        // logger2b.log("Synchronized Message 2");
        
        // if (logger2a == logger2b) {
        //     System.out.println("O 동일한 인스턴스");
        // } else {
        //     System.out.println("X 다른 인스턴스");
        // }
        // System.out.println("\n========== 로그 출력 2 ==========");
        // System.out.println("[LoggerSynchronizedLazy 로그]");
        // System.out.println(logger2a.getLog());




        System.out.println("\n========== 방식 3: Enum (권장) ==========");
        LoggerEnum logger3a = LoggerEnum.INSTANCE;
        LoggerEnum logger3b = LoggerEnum.INSTANCE;

        logger3a.log("Enum Message 1");
        logger3b.log("Enum Message 2");

        if (logger3a == logger3b) {
            System.out.println("O 동일한 인스턴스");
        } else {
            System.out.println("X 다른 인스턴스");
        }

        System.out.println("\n========== 로그 출력 3 ==========");
        System.out.println("[LoggerEnum 로그]");
        System.out.println(logger3a.getLog());

    }
}
