//public class Tankas {
//
//    int x = 0;
//    int y = 0;
//    int[] shots = {0, 0, 0, 0};
//    String kryptis = "Šiaurė"; //krytis perkelti i enuma
//    int moveCount = 0;
//
//    public void judejimas(){
//        System.out.println(Main.getTime() + " Tankas judejimo kryptis "+ this.kryptis +"(" + x + ";" + y + ").");
//    }
//
//    public void siaure() {
//        this.x++;
//        this.kryptis = "Šiaurė";
//        this.moveCount++;
//        judejimas();
//        //System.out.println(Main.getTime() + " Tankas pajuda į Šiaurę (" + x + ";" + y + ")."); //perkelti i funkcija
//    }
//
//    public void rytai() {
//        this.y++;
//        this.kryptis = "Rytai";
//        this.moveCount++;
//        judejimas();
//        //System.out.println(Main.getTime() + " Tankas pajuda į Rytus (" + x + ";" + y + ").");
//    }
//
//    public void pietus() {
//        this.x--;
//        this.kryptis = "Pietus";
//        this.moveCount++;
//        judejimas();
//        //System.out.println(Main.getTime() + " Tankas pajuda į Pietus (" + x + ";" + y + ").");
//    }
//
//    public void vakarai() {
//        this.y--;
//        this.kryptis = "Vakarai";
//        this.moveCount++;
//        judejimas();
//        //System.out.println(Main.getTime() + " Tankas pajuda į Vakarus (" + x + ";" + y + ").");
//    }
//
//    public void info() {
//        int shotsSum = totalShots();
//        System.out.println(Main.getTime() + " INFO: Tanko koordinatė: (" + x + ";" + y + ")," +
//                "kryptis: " + kryptis + ", tankas pajudėjo " + moveCount + " kart.");
//        System.out.println(Main.getTime() + " INFO: Tanko šūviai: " + shots[0] + " į Šiaurę, " +
//                shots[1] + " į Rytus, " + shots[2] + " į Pietus, " + shots[3] + " į Vakarus. Iš viso šūvių: " + shotsSum + ".");
//    }
//
//    public void suvis() {
//        //this.totalShots++;
//        switch (kryptis) {
//            case "Šiaurė" -> shots[0]++;
//            case "Rytai" -> shots[1]++;
//            case "Pietus" -> shots[2]++;
//            case "Vakarai" -> shots[3]++;
//        }
//        System.out.println(Main.getTime() + " Atliktas šuvis į " + kryptis);
//    }
//
//    public void pabaiga() {
//        System.out.println("Pabaiga...");
//    }
//
//    public int totalShots() {
//        return shots[0] + shots[1] + shots[2] + shots[3];
//    }
//
//    public void taikinys() {
//        int min = -10;
//        int max = 10;
//        int target_x = (int) Math.floor(Math.random() * (max - min + 1) + min);
//        int target_y = (int) Math.floor(Math.random() * (max - min + 1) + min);
//        System.out.println(Main.getTime() + " Taikinio koordinatė: (" + target_x + ";" + target_y + ")");
//    }
//}
