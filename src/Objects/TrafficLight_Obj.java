package Objects;

import GUI.SimulatorValue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLight_Obj extends Simulator_Obj {
    private boolean is_red = false;
    private int x_location;
    private int y_location;

    public TrafficLight_Obj(int x_location, int y_location) {
        super("Traffic Light Block", "/Users/user/Desktop/Assessment_NanKaw/src/Photo/Green.jpg",
                false, null, 'E', false, null);
        this.x_location = x_location;
        this.y_location = y_location;
    }

    public boolean get_is_red() {
        return is_red;
    }

    public void set_is_red() {

        if(this.is_red)
        {
            this.setPic_location("/Users/user/Desktop/Assessment_NanKaw/src/Photo/Green.jpg");
            this.is_red = false;
        }
        else
        {
            this.setPic_location("/Users/user/Desktop/Assessment_NanKaw/src/Photo/radd.jpg");
            this.is_red = true;
        }

    }

    public int getX_location() {
        return x_location;
    }

    public void setX_location(int x_location) {
        this.x_location = x_location;
    }

    public int getY_location() {
        return y_location;
    }

    public void setY_location(int y_location) {
        this.y_location = y_location;
    }
}
