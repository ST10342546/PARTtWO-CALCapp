package com.simone.calculatorparttwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    import android.os.Bundle
    import android.view.View
    import android.widget.Button
    import android.widget.EditText
    import android.widget.TextView
    import kotlin.math.sqrt






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        package com.simone.simonesfirstcalculator

        import androidx.appcompat.app.AppCompatActivity
                import android.os.Bundle
                import android.view.View
                import android.widget.Butt

        class MainActivity : AppCompatActivity() {

            private lateinit var Number1EditText: EditText
            private lateinit var Number2EditText: EditText
            private lateinit var OperatorEditText: EditText
            private lateinit var CalculateButton: Button
            private lateinit var ResultTextView: TextView

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                Number1EditText = findViewById(R.id.Number1EditText)
                Number2EditText = findViewById(R.id.Number2EditText)
                OperatorEditText = findViewById(R.id.OperatorEditText)
                CalculateButton = findViewById(R.id.CalculateButton)
                ResultTextView = findViewById(R.id.ResulttextView)

                CalculateButton.setOnClickListener {
                    val number1 = Number1EditText.text.toString().toDouble()
                    val number2 = Number2EditText.text.toString().toDouble()
                    val operator = OperatorEditText.text.toString()

                    val result = when (operator) {
                        "+" -> number1 + number2
                        "-" -> number1 - number2
                        "*" -> number1 * number2
                        "/" -> {
                            if (number2 == 0.0) {
                                "Division by zero is not allowed"
                            } else {
                                number1 / number2
                            }
                        }
                        "^" -> {
                            if (number2 >= 0) {
                                var powerResult = 1.0
                                for (i in 1..number2.toInt()) {
                                    powerResult *= number1
                                }
                                powerResult
                            } else {
                                "Exponent must be a non-negative integer"
                            }
                        }
                        "sqrt" -> {
                            if (number1 >= 0) {
                                sqrt(number1)
                            } else {
                                "${sqrt(-number1)}i"
                            }
                        }
                        else -> "Invalid operator"
                    }

                    ResultTextView.text = "Result: $result"
                }

                // Set onClickListeners for the basic arithmetic buttons
                val AdditionButton = findViewById<Button>(R.id.Additionbutton)
                val SubtractionButton = findViewById<Button>(R.id.Subtractionbutton)
                val MultiplicationButton = findViewById<Button>(R.id.MultiplicationButton)
                val DivisionButton = findViewById<Button>(R.id.DivisionButton)

                AdditionButton.setOnClickListener {
                    OperatorEditText.setText("+")
                }

                SubtractionButton.setOnClickListener {
                    OperatorEditText.setText("-")
                }

                MultiplicationButton.setOnClickListener {
                    OperatorEditText.setText("*")
                }

                DivisionButton.setOnClickListener {
                    OperatorEditText.setText("/")
                }
            }
        }

    }
}