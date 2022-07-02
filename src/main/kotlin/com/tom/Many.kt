package com.tom

import java.time.LocalDateTime

fun main() {
    val parkingLot = HashMap<String,Car?>()
    var enter = LocalDateTime.of(2016,4,28,7,12,56)
    var car:Car? = Car("DD-0001",enter)//car1 enter
    parkingLot.put(car!!.id, car)
    car = Car("FF-0002", enter.plusMinutes(40))//car2 enter
    parkingLot.put(car.id, car)

    //car1 leaving
    var leave = LocalDateTime.of(2016,4,28,12,16,55)
    car = parkingLot.get("DD-0001")
    car?.leave = leave
    println("車號: ${car?.id} 總計 ${car?.duration()} 分鐘")
    parkingLot.remove("DD-0001")
    println("目前剩餘車輛: ${parkingLot.size}")

    //car2 leaving
    car = parkingLot.get("FF-0002")
    car?.leave = leave.plusHours(3)
    println("車號: ${car?.id} 總計 ${car?.duration()} 分鐘")
    parkingLot.remove("FF-0002")
    println("目前剩餘車輛: ${parkingLot.size}")


    /*val list = listOf(5,4,3,2,6,7,9)
    println(list)
    println(list.get(3))

    val scores = listOf(55,92,71,60,43,100)
    for (score in scores){
        println(score)
    }
    var mutableList = mutableListOf(7,2,1,5,4,6,0)
    mutableList.add(3)
    println(mutableList)*/
}