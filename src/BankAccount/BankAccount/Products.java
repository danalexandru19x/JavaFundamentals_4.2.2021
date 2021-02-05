
public class Products {
    String name;
    double price;
    String expirationDate;

    public void changePrice(double finalPrice){
        if(finalPrice < (price+(14/100*price)) && finalPrice > (price-(14/100*price))){
            price = finalPrice;
        }else {
            System.out.println("Price cannot be modified with more than 14% of original price");
        }
    }
}
