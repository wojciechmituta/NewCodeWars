package codeWars;

public class TheOffice {
    public static String boredom(Person[] staff) {
        int count = 0;

        for (int a = 0; a < staff.length - 1; a++) {
            switch (staff[a].department) {
                case "accounts":
                    count += 1;
                    break;
                case "finance":
                    count += 2;
                    break;
                case "canteen":
                    count += 10;
                    break;
                case "regulation":
                    count += 3;
                    break;
                case "trading":
                    count += 6;
                    break;
                case "change":
                    count += 6;
                    break;
                case "IS":
                    count += 8;
                case "retail":
                    count += 5;
                    break;
                case "cleaning":
                    count += 4;
                    break;
                case "pissing about":
                    count += 25;
                    break;
            }
        }
        if (count <= 80) {
            return "kill me now";
        }
        if ( count < 100) {
            return "i can handle this";
        }
        return "party time!!";
    }
}
