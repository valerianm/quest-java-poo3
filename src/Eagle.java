public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    public void takeOff() {
        if(!this.flying){
            this.flying = true;
            System.out.println(this.getName() + " takes off");
        }
    }

    public int ascend(int meters){
        if(this.flying) {
            this.altitude += meters;
            if (this.altitude < 0) {
                this.altitude = 0;
            }
            System.out.println(this.getName() + " flies up, it's altitude is " + this.altitude + " meters.");
        }
        return this.altitude;
    }

    public int descend(int meters) {
        if(this.flying) {
            this.altitude -= meters;
            if (this.altitude < 0) {
                this.altitude = 0;
            }
            System.out.println(this.getName() + " flies down, it's altitude is " + this.altitude + " meters.");
        }
        return this.altitude;
    }

    public void land() {
        if(this.flying && this.altitude <= 1) {
            this.flying = false;
            System.out.println(this.getName() + " lands.");
        }
        else {
            System.out.println(this.getName() + " is too high to land.");
        }
    }
}
