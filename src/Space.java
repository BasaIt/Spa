public class Space {
    public static void main(String[] args) {
        String[] mNameOMaunt = {"Декарбь", "Январь","Февраль",
                "Март", "Апрель", "Май",
                "Июнь", "Июль", "Август",
                "Сентябрь", "Октябрь", "Ноябырь"};
        String mResult = "";
        for (int i = 0; i < mNameOMaunt.length; i++) {
            mResult += mNameOMaunt[i];
            if (i == mNameOMaunt.length-1){
                mResult += ".";
            }else
            {
                mResult += ", ";
            }
        }
        System.out.println(mResult);

        int mNumersOfMounth = 15;

        switch (mNumersOfMounth){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
            case 4:
                System.out.println("Апрель");
            case 5:
                System.out.println("Май");
            case 6:
                System.out.println("Июнь");
            case 7:
                System.out.println("Июль");
            case 8:
                System.out.println("Август");
            case 9:
                System.out.println("Сентябрь");
            case 10:
                System.out.println("Октябрь");
            case 11:
                System.out.println("Ноябырь");
            case 12:
                System.out.println("Декарбь");
            default:
                System.out.println("Месяц не существует");
                break;
        }
    }
}
