package app.com.kotlinapp

/**
 * Created by macbookpro on 31/03/2018.
 */
enum class TestEnum {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}


enum class AnotherTestEnum(mass:Double, radius:Double) {

    MERCURY(3.3333,2.45445),
    VENUS(4.3333,8.45445),
    MARS(34.3333,459.45445),
    EARTH(313.3333,24.45445),
    JUPITER(38.3333,26.45445),
    NEPTUNE(399.3333,256.45445),
    URANUS(34.3333,299.45445),
    PLUTO(39.3333,290.45445),

}