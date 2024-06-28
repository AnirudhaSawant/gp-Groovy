package com.globalpayex

def studentData = [
        Tuple.tuple("anirudha", 'm', 90),
        Tuple.tuple("jane", 'f', 80),
        Tuple.tuple("virat", 'm', 95),
        Tuple.tuple("smiti", 'f', 70),
]

def maxTuple = studentData[0]

for(def student in studentData) {
    if(student.v3 > maxTuple.v3) {
        maxTuple = student
    }
}

println "Name: ${maxTuple.v1}\nGender: ${maxTuple.v2}\nMarks: ${maxTuple.v3}"