public class Cart
{
    private String id;
    public Cart(String id){
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format("Id: %s", id);
    }
}
