public class Rectangle extends Shape {
    double length, width;

        public Rectangle(double length, double width) {
                this.length = length;
                this.width = width;
        }

        @Override
        double getArea() {
            return length * width;
        }
}
