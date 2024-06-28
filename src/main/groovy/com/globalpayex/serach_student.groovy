package com.globalpayex

def studentData = [
        Tuple.tuple("anirudha", 'm', 90),
        Tuple.tuple("jane", 'f', 80),
        Tuple.tuple("virat", 'm', 95),
        Tuple.tuple("smiti", 'f', 70),
]

def sc = new Scanner(System.in)
println "Please enter the roll no"
def roll = sc.nextInt();

def details

for(def student in studentData) {
    if(student.v3 == roll) {
        details = student
        break
    }
}

if(details) {
    println "Name: ${details.v1}\nGender: ${details.v2}\nRoll: ${details.v3}"
}
else{
    println "Student with ${roll} not found"
}

