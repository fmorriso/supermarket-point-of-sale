public class POSline
{
    private String id;
    private boolean active;
    private Cart[] line;

    public POSline(String id, int capacity){
        this.id = id;
        line = new Cart[capacity];
    }

    public String getId() { return id; }
    public Cart[] getCarts() { return line; }

    public void joinLine(Cart newCart){
        // find first available place in line to put the cart
        for (int i = 0; i < line.length; i++) {
            if(line[i] == null){
                line[i] = newCart;
                return;
            }
        }
    }

    public void checkOutCart(){
        // 1. get cart at the head of the line
        Cart c = leaveLine(0);

        // 2. empty cart, keeping running total as we process each item in the cart

        // 3. once the customer has paid, remove the cart from the line and move everyone else up in line.


    }

    /**
     * Removes the Cart at position n from line by shifting down all the
     * array entries bigger than n before returning the indicated cart.
     * @param n - the
     * @return - The Cart instance that was removed
     */
    public Cart leaveLine(int n)
    {
        Cart c = line[n];

        for(int i = Math.min(n + 1, line.length); i < line.length; i++){
            line[i - 1] = line[i];
        }

        return c;
    }

    @Override
    public String toString(){
        StringBuilder sbr = new StringBuilder();
        sbr.append(String.format("Line: %s%n", id));
        // include any carts that are currently in line
        for (int i = 0; i < line.length ; i++) {
            if(line[i] == null) continue;
            sbr.append(String.format("Cart %d: %s%n", i, line[i].toString()));
        }

        return sbr.toString();
    }

}
