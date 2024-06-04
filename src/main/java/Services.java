public class Services {
    boolean laundry = false;
    boolean spa = false;
    boolean lunch = false;
    boolean breakfast = false;
    boolean dinner = false;
    static final int laundryPrice = 500;
    static final int spaPrice = 1500;
    static final int lunchPrice = 200;
    static final int breakfastPrice = 100;
    static final int dinnerPrice = 400;

    Services(boolean laundry,boolean spa, boolean breakfast,boolean lunch,boolean dinner){
        this.laundry = laundry;
        this.spa = spa;
        this.lunch =lunch;
        this.breakfast=breakfast;
        this.dinner=dinner;
    }

}
