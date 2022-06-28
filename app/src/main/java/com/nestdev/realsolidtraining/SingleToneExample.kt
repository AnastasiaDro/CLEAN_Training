package com.nestdev.realsolidtraining

//The example of the singletone pattern
//Just for writing something in apllication class
class SingleToneExample {


    companion object {
       private var instance: SingleToneExample? = null

        fun getInstanse(): SingleToneExample {
            if (instance == null)
                return SingleToneExample()
            else
                return instance as SingleToneExample
        }
    }
}