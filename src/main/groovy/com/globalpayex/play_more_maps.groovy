package com.globalpayex

def studentData = [58: Tuple.tuple("anirudha",'m',90),
                   10: Tuple.tuple("jane",'f',80),
                   18: Tuple.tuple("virat",'m',95),
                   20: Tuple.tuple("smiti",'f',70),
]

studentData.each {
    if(it.value.v2 == 'm') {
        println "Name: $it.value.v1\nRoll: $it.value.v3"
    }
}

println "========================================="
println "========================================="

studentData.each {roll,studentTuple ->
    if(studentTuple.v2 == 'm') {
        println "Name: $studentTuple.v1\nRoll: $roll"
    }
}

def mpp1 = studentData
        .findAll {rollNo,studentTuple ->
            studentTuple.v2 == 'm'
        }

println mpp1

def mpp2 = studentData
        .collectEntries {roll,studentTuple ->
    [roll,Tuple.tuple(studentTuple.v1.capitalize(),studentTuple.v2,studentTuple.v3)]
}

println mpp2

def count = studentData.countBy {it.value.v2}

println count

def mpp3 = studentData.groupBy {it.value.v2}
println mpp3