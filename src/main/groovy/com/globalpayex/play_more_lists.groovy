package com.globalpayex

def nos = [5,6,3,4,9,10,3,7,1,2]

println "********Even********"
nos.each {
    if(it % 2 == 0 && it > 2) {
        println it
    }
}

def even = []
def odd = []
nos.each {
    if(it % 2 == 0) {
        even << it
    }
    else{
        odd << it
    }
}

println("Even list: $even")
println("Odd list: $odd")

def l1 = nos.findAll{it > 5}
println l1

// mapping like function
def l2 = nos.collect {it -= 1}
println l2

def l3 = nos.findAll{it % 2 && it > 3}.collect{it ** 2}
println l3

def isTrue = nos.every {it > 3}
println isTrue

def cars = ["audi","bmw","mercedes"]

def l4 = cars.collect{it.capitalize()}
println l4

// Spread dot operator (*.)alternate to collect
def l5 = cars*.capitalize()
println(l5)

def l6 = nos*.minus(1)
println l6
