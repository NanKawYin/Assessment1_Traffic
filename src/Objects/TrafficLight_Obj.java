package Objects;

public class TrafficLight_Obj extends Simulator_Obj {
    private boolean is_red = false;
    private int x_location;
    private int y_location;

    public TrafficLight_Obj(int x_location, int y_location, char[] direction) {
        super("Traffic Light Block", "/Users/waiyanpaingoo/Desktop/Second Sem/Java/Assessment_Nan_Kaw/src/Photo/Green_Light.jpg",
                false, null, direction, false, null);
        this.is_red = false;
        this.x_location = x_location;
        this.y_location = y_location;
    }

    public boolean get_is_red() {
        return is_red;
    }

    public void set_is_red() {

        if(this.is_red)
        {
            this.setPic_location("/Users/waiyanpaingoo/Desktop/Second Sem/Java/Assessment_Nan_Kaw/src/Photo/Green_Light.jpg");
            this.is_red = false;
        }
        else
        {
            this.setPic_location("/Users/waiyanpaingoo/Desktop/Second Sem/Java/Assessment_Nan_Kaw/src/Photo/Red_Light.jpg");
            this.is_red = true;
        }

    }

    public int getX_location() {
        return x_location;
    }


    public int getY_location() {
        return y_location;
    }

}
