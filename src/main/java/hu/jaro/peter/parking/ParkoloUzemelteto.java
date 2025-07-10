package hu.jaro.peter.parking;

public class ParkoloUzemelteto {
    public static void main(String[] args) {
        Parkolo maganParkolo= new Parkolo(5);

        SzemelyGepjarmu motor = new SzemelyGepjarmu("MMM-111",CarType.BENZIN, 8, 11, 2);
        SzemelyGepjarmu auto1 = new SzemelyGepjarmu("AAA-222",CarType.GAZOLAJ, 9, 30, 5);
        SzemelyGepjarmu auto2 = new SzemelyGepjarmu("AAA-333",CarType.HIBRID, 10, 5, 5);
        SzemelyGepjarmu auto3 = new SzemelyGepjarmu("AAA-444",CarType.ELEKTROMOS, 11, 55, 5);
        SzemelyGepjarmu auto4 = new SzemelyGepjarmu("AAA-555",CarType.GAZOLAJ, 9, 30, 8);
        TeherGepjarmu teher1 = new TeherGepjarmu("TTT-111", CarType.GAZOLAJ, 8,45,2000,3);
        TeherGepjarmu teher2 = new TeherGepjarmu("TTT-222",CarType.GAZOLAJ, 16,15,4000,3);
        TeherGepjarmu teher3 = new TeherGepjarmu("TTT-333",CarType.ELEKTROMOS, 17,45,4000,6);

        maganParkolo.parkol(motor, 8, 11);
        maganParkolo.parkol(teher1, 8, 15);
        maganParkolo.parkol(auto1, 9, 30);
        maganParkolo.parkol(auto2, 10, 5);
        maganParkolo.kiparkolas(motor, 11, 3);
        maganParkolo.parkol(auto3, 11, 55);
        maganParkolo.kiparkolas(auto2, 12, 12);
        maganParkolo.parkol(auto4, 12, 0);
        maganParkolo.parkol(teher2, 16, 45);
        maganParkolo.parkol(teher3, 17, 15);
        maganParkolo.kiparkolas(auto1, 17,20);
        maganParkolo.kiparkolas(auto1, 17,22);
        maganParkolo.kiparkolas(teher3, 17,33);
        maganParkolo.kiparkolas(auto4, 17,45);
        System.out.println(maganParkolo);
    }
}
