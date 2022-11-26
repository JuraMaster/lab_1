package lab.rob1;

public class Shop {

    private String section;
    private String infoOwner;

    public Shop(String section, String infoOwner) {
        this.section = section;
        this.infoOwner = infoOwner;
    }

    public int sectionShop() {
        if (section.equals("Продуктовий")) {
            return 100_000;
        }else if (section.equals("Побутовий")) {
            return 50_000;
        }
        return 20_000;
    }

    public void info() {
        if (infoOwner.equals("Вася")) {
            System.out.println("Власник магазину не Вася тому що він ОХОРОНЕЦЬ \uD83D\uDC6E");
        } else {
            System.out.println("Власник магазину " + infoOwner + "\uD83D\uDE0E");
        }
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getInfoOwner() {
        return infoOwner;
    }

    public void setInfoOwner(String infoOwner) {
        this.infoOwner = infoOwner;
    }
}
