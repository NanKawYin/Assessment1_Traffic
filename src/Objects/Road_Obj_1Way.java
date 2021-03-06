package Objects;

public class Road_Obj_1Way {
    private int ROW, COL,x, y;
    private String rotation;
    private Simulator_Obj[][] objAry;
    private String pic_location = "/Users/user/Desktop/Assessment_NanKaw/src/Photo/Road.jpg";

    public Road_Obj_1Way(int row, int col,int X , int Y, String rot) {
        this.x = X;
        this.y = Y;
        this.rotation = rot;
        this.ROW = row;
        this.COL = col;
        objAry = new Simulator_Obj[ROW][COL];
        this.build_road_structure();
    }
    public void rotate(){
        if(this.rotation.equals("H"))
        {
            this.rotation = "N";
        }
        else
        {
            this.rotation = "H";
        }
        this.build_road_structure();
    }
    public String getRotation(){
        return this.rotation;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Simulator_Obj[][] get_objAry(){
        return this.objAry;
    }
    private void build_ary_grass()
    {
        try
        {
            int i = 0;
            while (i < ROW)
            {
                for (int j = 0; j < COL; j++)
                {
                    objAry[i][j] = new Grass_Block();
                }
                i++;
            }
        }catch (Exception e) {
            System.out.print("Error");
        }
    }
    private void build_road_structure(){
        this.build_ary_grass();
        if(this.rotation.equals("H")){
            this.objAry[x][y] = new Road_Block(new char[]{'E'},pic_location);
            this.objAry[x][y+1] = new Road_Block(new char[]{'E'},pic_location);
            this.objAry[x][y+2] = new Road_Block(new char[]{'E'},pic_location);
            this.objAry[x][y+3] = new Road_Block(new char[]{'E'},pic_location);
            this.objAry[x][y+4] = new Road_Block(new char[]{'E'},pic_location);
            this.objAry[x][y+5] = new Road_Block(new char[]{'E'},pic_location);
            this.objAry[x+1][y] = new Road_Block(new char[]{'W'},pic_location);
            this.objAry[x+1][y+1] = new Road_Block(new char[]{'W'},pic_location);
            this.objAry[x+1][y+2] = new Road_Block(new char[]{'W'},pic_location);
            this.objAry[x+1][y+3] = new Road_Block(new char[]{'W'},pic_location);
            this.objAry[x+1][y+4] = new Road_Block(new char[]{'W'},pic_location);
            this.objAry[x+1][y+5] = new Road_Block(new char[]{'W'},pic_location);
        }
        else{
            this.objAry[x][y] = new Road_Block(new char[]{'N'},pic_location);
            this.objAry[x+1][y] = new Road_Block(new char[]{'N'},pic_location);
            this.objAry[x+2][y] = new Road_Block(new char[]{'N'},pic_location);
            this.objAry[x+3][y] = new Road_Block(new char[]{'N'},pic_location);
            this.objAry[x+4][y] = new Road_Block(new char[]{'N'},pic_location);
            this.objAry[x+5][y] = new Road_Block(new char[]{'N'},pic_location);
            this.objAry[x][y+1] = new Road_Block(new char[]{'S'},pic_location);
            this.objAry[x+1][y+1] = new Road_Block(new char[]{'S'},pic_location);
            this.objAry[x+2][y+1] = new Road_Block(new char[]{'S'},pic_location);
            this.objAry[x+3][y+1] = new Road_Block(new char[]{'S'},pic_location);
            this.objAry[x+4][y+1] = new Road_Block(new char[]{'S'},pic_location);
            this.objAry[x+5][y+1] = new Road_Block(new char[]{'S'},pic_location);
        }
    }
}
