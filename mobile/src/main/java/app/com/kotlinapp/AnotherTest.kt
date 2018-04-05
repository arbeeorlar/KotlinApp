package app.com.kotlinapp

/**
 * Created by macbookpro on 31/03/2018.
 */
class AnotherTest public  constructor (firstName:String,lastName:String, howOld:Int?) {

    private var name:String = ""
    private var age:Int?


    init {
        this.age = howOld
        this.name = "$firstName,$lastName"

    }

    fun getName():String = this.name
    fun getAge():Int? =  this.age

    var Height: Double
        get() = this.Height
        set(value: Double) {
            this.Height = value
        }

    var Width: Double
    get() = this.Width
    set(value: Double) {
        this.Width = value
    }
}