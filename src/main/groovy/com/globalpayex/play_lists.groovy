package com.globalpayex

def cars = ["audi","bmw","i20"]

println cars[0]
println cars[-1]

cars[-1] = "mercedes"
println cars

def marks = [10,5,6,10,6,7,8,1,0]
println marks[-4..-1]
println marks[0..4]

println "bmw" in cars
println "i10" in cars

for(def car in cars) {
    println car.toUpperCase()
}

cars << "porshe"
println cars

cars << "i10" << "i20"
println cars

cars.removeLast()
cars.removeLast()

println cars

cars.push("i10")
println cars

cars.pop()
println cars

def m1 = [1,3,5]
def m2 = [3,5,9]

println m1 - m2
println m2 - m1

println m1.intersect(m2)
println((m1 + m2).unique())

println marks.max()
println marks.min()
println marks.average()

def marksDivision = [
        [5,6,10,3],
        [6,7,10,2],
        [6,9,1]
]

println marksDivision.flatten().average()

def names = ['anirudha','virat','rohit',null]
println names*.toUpperCase()

names.each {println it ?.toUpperCase()}