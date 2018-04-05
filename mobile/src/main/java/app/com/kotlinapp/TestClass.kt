package app.com.kotlinapp

/**
 * Created by macbookpro on 18/03/2018.
 */
public class TestClass {


 class TestClass constructor(val x:String,val y:Int){}

    public fun whenAsSwitch(x:String){

        when(x) {
            "Hello" -> println("This is my $x")
            else->println("$x")
        }

    }

   public fun isMyFirstMethod(x:Int) : Boolean{

        val isZero = when (x) {
            Int.MIN_VALUE -> true
            Int.MAX_VALUE -> true
            else -> false
        }
        return isZero

    }



}