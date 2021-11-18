public class OverloadBox {

    double width;
    double height;
    double depth;

    // constructor used when all dimensions specified
    OverloadBox(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when cube is created
    OverloadBox(double len) {
        width = height = depth = len;
    }

    OverloadBox() {
        width = -1; // use -1 to idicate
        height = -1; // an uninitialized
        depth = -1; // box
    }

    double volume() {
        return width * height * depth;
    }
}

class OverloadBoxCons {
    public static void main(String[] args) {
        // create Overload boxes

        OverloadBox b1 = new OverloadBox(10, 20, 15);
        OverloadBox b2 = new OverloadBox();
        OverloadBox b3 = new OverloadBox(7);

        double vol;
        vol = b1.volume();
        System.out.println("Volume of B1 is: " + vol);

        vol = b2.volume();
        System.out.println("Volume of B2 is: " + vol);

        vol = b3.volume();
        System.out.println("Volume of B3 is: " + vol);

    }
}
