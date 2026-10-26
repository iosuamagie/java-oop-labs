public abstract class Form {
    private String color;
    private static int counter=0;

    public Form() {
        color="white";
        counter++;
    }

    public Form(String color) {
        color=color;
        counter++;
    }

    public float getArea(){
        return 0;
    }

    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("This form has the color:").append(color);
        return sb.toString();
    }

    public static int getCounter() {
        return counter;
    }

}
