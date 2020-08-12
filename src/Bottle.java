public class Bottle {
    int salt;
    int pepper;
    int galric;
    int number;

    public int getSalt() {
        return salt;
    }

    public int getPepper() {
        return pepper;
    }

    public int getGalric() {
        return galric;
    }

    public int getNumber() {
        return number;
    }

    //result --> when same ratio return the same previous when R happens then removed
    public Bottle(int salt, int pepper, int galric, int number) {
        int gcd = 1;
        if (salt != -1) {
            gcd = gcd(gcd(salt,pepper), galric);
        }
        this.salt = salt/gcd;
        this.pepper = pepper/gcd;
        this.galric = galric/gcd;
        this.number = number;
    }
    private int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    @Override
    public boolean equals(Object o) {
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }
        if (!(o instanceof Bottle)) {
            return false;
        }

        Bottle c = (Bottle) o;

        // Compare the data members and return accordingly
        return salt == c.salt && pepper == c.pepper && galric == c.galric;
    }
}
