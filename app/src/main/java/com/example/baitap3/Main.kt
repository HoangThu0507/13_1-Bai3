package com.example.baitap3

import java.util.*

class Main {
    fun CheckCycle(): Boolean {
        var scanner = Scanner(System.`in`)
        var n = 0
        do{
            print("Nhập số đỉnh: ")
            n= scanner.nextInt()
        }while (n <0)
        var arrayA = IntArray(n)
        var arrayB = IntArray(n)
        println("Nhập phần tử mảng A")
        for(i in 0 until n){
            print("A["+(i+1)+"] = ")
            arrayA[i] = scanner.nextInt()

        }
        println("Nhập phần tử mảng B")
        for(i in 0 until n){
            print("A["+(i+1)+"] = ")
            arrayB[i] = scanner.nextInt()

        }
        var checkArr = IntArray(n)
        for (i in 0 until n) {
            checkArr[arrayA[i]-1 ] = arrayB[i]-1
            //println("checkArr["+(arrayA[i] - 1)+"] = "+ (arrayB[i] - 1))
        }
        var edge = 0
        var curr = 0
        do {
            //print("curr "+curr+" map["+ curr+"]="+checkArr[curr] +"  ")
            curr = checkArr[curr]
            edge += 1
        } while (curr != 0)
        return edge == n
    }
}

fun main() {
    var main = Main()
    if(main.CheckCycle())
        return print("Đây là chu trình")
    else
        return print("Không phải chu trình")
}