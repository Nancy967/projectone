package com.tom

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enter = LocalDateTime.of(2016,4,28,7,12,56)
    val leave = LocalDateTime.of(2016,4,28,12,16,55)
    var car = Car("QQ-0002", enter)
    car.leave = leave
    println("${car.duration()} 分鐘")
    val hours = Math.ceil(car.duration()/60.0).toLong()
    println("$hours 小時")
}

class Car(val id:String, val enter:LocalDateTime){
    var leave:LocalDateTime? = null
        set(value) {
        if (enter.isBefore(value))
            field = value
        }
    fun duration() = Duration.between(enter,leave).toMinutes()
}