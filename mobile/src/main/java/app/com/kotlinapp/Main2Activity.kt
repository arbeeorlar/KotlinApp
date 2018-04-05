package app.com.kotlinapp

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnAddNewFood.setOnClickListener(View.OnClickListener {

            try {
                var test = TestClass();
                var anotherTest = app.com.kotlinapp.AnotherTest("Ademola", "PAusma", 10)
                anotherTest.Height = 2.00
                anotherTest.Width = 4.00

                var string: String = txtAddNewFood.text.toString()
                btnClickMe.text = string

                println("This  is my Planet --- ${AnotherTestEnum.EARTH}")

                println("${test.whenAsSwitch("${txtAddNewFood.text}")}")
                println("My  name  is ${anotherTest.Width}  and  i am ${anotherTest.getAge()} old")

                btnAddNewFood.setBackgroundColor(android.R.color.holo_orange_dark)

            }catch (ex:Exception){
                ex.message
            }
        })

    }
}
