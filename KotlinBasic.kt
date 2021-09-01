package com.isp.fistbasickotlindemo

fun main() {

var temp:Int = maths(20,20).result;
    var temp2:Int;
    var mm:maths2;
    var ss:Int = maths2().result(20,30);
    println(ss);
}
data class maths(val num1:Int,val num2:Int){
    val result=num1+num2
}
class maths2(){
    fun result(num1:Int, num2:Int):Int{
        return num1+num2
    }
}