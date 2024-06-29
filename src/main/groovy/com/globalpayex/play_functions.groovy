package com.globalpayex

def operations(a,b) {
    def i = 10
    def add = {
        def r1 = a + b
        r1 + 10
    }

    def multiplication = {
        def r2 = a * b
        r2 + 10
    }

    println add()
    println multiplication()
}

operations 5,6


def nos = [5,6,10,2,4,3,9,6,2]

def forEach(list,fn) {
    for(def element in list) {
        fn(element)
    }
}

println "*******Even******"
def fn = {element ->
    if(element % 2 == 0) {
        println element
    }
}
forEach(nos,fn)

println "****Odd****"
//forEach(nos, {element ->
//    if(element % 2 && element > 3) {
//        println element
//    }
//})

//forEach(nos, {
//    if(it % 2 && it > 3) {
//        println it
//    }
//})

forEach(nos) {
    if(it % 2 && it > 3) {
        println it
    }
}