package com.globalpayex

List.metaClass.evens = {
    delegate.findAll {it % 2 == 0}
}

List.metaClass.odds = {
    delegate.findAll {it % 2}
}

List.metaClass.sortDescending = {
//    delegate.sort(false) {
//        a , b -> b.compareTo(a)
//    }
    delegate.sort(false) {a , b -> b <=> a}
}

def nos = [5,6,2,3,8,9,18,1,0,4]
println nos.evens()

def n = [5,3,2,8,10]
println n.odds()

println nos.sortDescending()
println nos


