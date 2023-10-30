public class WaterBottle {

    public int volume;

//    WaterBottle waterBottle1 = new WaterBottle(100)

    public WaterBottle(int inputVolume){
        this.volume = inputVolume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drinkFunction(){
        return this.volume - 10;
    }

    public int bigGulp(){
        this.volume = 0;
        return this.volume;
    }

//    public int bigGulp(int newVolume){
//        this.volume = newVolume;
//        return newVolume;
//    } //I think there's a better way to do this



    public int fillUp(){
        this.volume = 100;
        return this.volume;
    }
}
