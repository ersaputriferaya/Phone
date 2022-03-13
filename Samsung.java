package contohinterface;

public class Samsung implements Phone {

    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 30;
    }
    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di SAMSUNG");
        System.out.println("Android version 11");
    }
    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }
    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    @Override
    public void dropped(){
        System.out.println("Hp tahan banting");
    }
    public int getVolume() {
        return this.volume;
    }

}
