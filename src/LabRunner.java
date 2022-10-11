public class LabRunner {
    public static void main(String[] args) {
        String vroom = new String("Mater");
        String s = "Tater";
        String kachow = new String(s);
        String fwoosh = "Tots";

        System.out.println(vroom);
        System.out.println(kachow);
        System.out.println(fwoosh);

        BabyParrot baby = new BabyParrot("Toucan", 3, 4.25);
        baby.setName("Lil' Beans");
        String info = baby.parrotInfo();
        System.out.println(info);

        System.out.println("Cows say \"moo\"!");
        System.out.println(" * *\n* * *\n * *");
        System.out.println("Now I know my\n A\n  B\n   C’s");
        System.out.println("An \"i\"\nfor\nan eye");
        System.out.println("The string \"\"\nis an empty string.");
        System.out.println("The escape sequence for \\ is \\\\");
        System.out.println("The escape sequence for \" is \\\"");
        System.out.println("/A\\V/A\\\n\\V/A\\V/");
        System.out.println("Use \"\\n\"\nfor a new line.");
        System.out.println("My favorite punctuation mark is \"\\\"");



    }
}
