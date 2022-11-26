package lab.rob1;

public class Items {

    private int countPeople;
    private int countProducts;
    private String typeComposition;
    private String nameItem;
    private int dataItem;
    private String place;
    private int weight;
    private double price;


    public Items(int countProducts, String typeComposition, String nameItem, int dataItem, int weight, double price) {
        this.countProducts = countProducts;
        this.typeComposition = typeComposition;
        this.nameItem = nameItem;
        this.dataItem = dataItem;
        this.weight = weight;
        this.price = price;
    }


    public void temp(){
        if(typeComposition.equals("Холодний Склад")){
            System.out.println("Температруа зберігання < 5 °С");
        }else if(typeComposition.equals("Звичайний Склад")){
            System.out.println("Температруа зберігання > 15 °С");
        }
    }

    public double salary(People o){
        System.out.println("Витрати на "+countPeople+" працівників складають: "+(o.getSalary() * countPeople));
        return o.salary() * countPeople;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public int getCountProducts() {
        return countProducts;
    }

    public void setCountProducts(int countProducts) {
        this.countProducts = countProducts;
    }

    public String getTypeComposition() {
        return typeComposition;
    }

    public void setTypeComposition(String typeComposition) {
        this.typeComposition = typeComposition;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public int getDataItem() {
        return dataItem;
    }

    public void setDataItem(int dataItem) {
        this.dataItem = dataItem;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
