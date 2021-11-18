public class Box {
    double width;
    double height;
    double depth;

    // diplay volume of a box
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);

    }

    // using constroctur for box
    Box() {
        System.out.println("constructing box");
    }

    // sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    int square(int i) {
        return i * i;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // assign values to mybox1's instance variables

        /*
         * mybox1.width = 10; mybox1.height = 20; mybox1.depth = 15;
         */
        mybox1.setDim(10, 20, 15);
        /* assign different values to mybox2' instance variables */

        /*
         * mybox2.width = 3; mybox2.height = 6; mybox2.depth = 9;
         */

        mybox2.setDim(3, 6, 9);
        Box mybox3 = new Box();
        // display volume of first box
        mybox1.volume();

        // display volume of second box
        mybox2.volume();

        // display square
        System.out.println("Square is " + mybox3.square(4));
    }
}
