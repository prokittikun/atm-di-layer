package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        DataSourceDB dataSourceDB = new DataSourceDB();
//        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
//        Bank bank = new Bank("My Bank", dataSourceFile);
//        ATM atm = new ATM(bank);
//        AtmUI atmUI = new AtmUI(atm);
//        atmUI.run();

        //spring สร้าง object ให้เรา
        ApplicationContext context = new AnnotationConfigApplicationContext(ATMConfig.class);

        //ขอให้ spring ส่ง object ที่สร้างแล้วมาให้เรา
        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}


