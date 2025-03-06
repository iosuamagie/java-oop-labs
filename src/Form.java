public abstract class Form {
    private String color;

    public Form() {
        color="white";
    }

    public Form(String color) {
        color=color;
    }

    public float getArea(){
        return 0;
    }

    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("This form has the color:").append(color);
        return sb.toString();
    }
}
