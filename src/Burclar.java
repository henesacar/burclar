import java.util.Scanner;
public class Burclar {
    public static void main(String[] args) {
        String month;
        int day;
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen doğum ayınızı yazın: ");
        month = scn.nextLine();
        System.out.println("Lütfen doğum gününüzü girin: ");
        day = scn.nextInt();
        if((month.equalsIgnoreCase("Mart") && day>=21) || (month.equalsIgnoreCase("Nisan") && day<=20)){
            System.out.println("Koç burcusunuz.");
        }else if ((month.equalsIgnoreCase("Nisan") && day>=21) || (month.equalsIgnoreCase("mayıs") && day<=21) ){
            System.out.println("Boğa burcusunuz.");
        }else if ((month.equalsIgnoreCase("Mayıs") && day>=22) || (month.equalsIgnoreCase("Haziran") && day<=22) ){
            System.out.println("İkizler burcusunuz.");
        }else if ((month.equalsIgnoreCase("Haziran") && day>=23) || (month.equalsIgnoreCase("Temmuz") && day<=22) ){
            System.out.println("Yengeç burcusunuz.");
        }else if ((month.equalsIgnoreCase("Temmuz") && day>=23) || (month.equalsIgnoreCase("Ağustos") && day<=22) ){
            System.out.println("Aslan burcusunuz.");
        }else if ((month.equalsIgnoreCase("Ağustos") && day>=23) || (month.equalsIgnoreCase("Eylül") && day<=22) ){
            System.out.println("Başak burcusunuz.");
        }else if ((month.equalsIgnoreCase("Eylül") && day>=23) || (month.equalsIgnoreCase("Ekim") && day<=22) ){
            System.out.println("Terazi burcusunuz.");
        }else if ((month.equalsIgnoreCase("Ekim") && day>=23) || (month.equalsIgnoreCase("Kasım") && day<=21) ){
            System.out.println("Akrep burcusunuz.");
        }else if ((month.equalsIgnoreCase("Kasım") && day>=22) || (month.equalsIgnoreCase("Aralık") && day<=21) ){
            System.out.println("Yay burcusunuz.");
        }else if ((month.equalsIgnoreCase("Aralık") && day>=22) || (month.equalsIgnoreCase("Ocak") && day<=21) ){
            System.out.println("Oğlak burcusunuz.");
        }else if ((month.equalsIgnoreCase("Ocak") && day>=22) || (month.equalsIgnoreCase("Şubat") && day<=19) ){
            System.out.println("Kova burcusunuz.");
        }else if ((month.equalsIgnoreCase("Şubat") && day>=20) || (month.equalsIgnoreCase("mart") && day<=20) ){
            System.out.println("Balık burcusunuz.");
        }
    }
}
