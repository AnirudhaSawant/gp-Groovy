package com.globalpayex


def studentData = [58: Tuple.tuple("anirudha",'m',90),
                   10: Tuple.tuple("jane",'f',80),
                   18: Tuple.tuple("virat",'m',95),
                   20: Tuple.tuple("smiti",'f',70),
]

def sc = new Scanner(System.in)
println "Please enter the roll no"
def roll = sc.nextInt();

def foundStudent = studentData[roll]


if(foundStudent) {
    println "Name: ${foundStudent.v1}\nGender: ${foundStudent.v2}\nMarks: ${foundStudent.v3}"
}
else{
    println "Student with ${roll} not found"
}



