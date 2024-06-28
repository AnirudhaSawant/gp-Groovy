package com.globalpayex

//def calculateGrade(marks) {
//    if(marks >= 70 && marks <= 100) {
//        'A'
//    }
//    else if(marks >= 60 && marks < 70) {
//        'B'
//    }
//    else if(marks >= 40 && marks < 60) {
//        'C'
//    }
//    else if(marks > 0 && marks < 40) {
//        'F'
//    }
//    else{
//        'I'
//    }
//}

def calculateGrade(marks) {
    switch (marks) {
        case 70..100: "A"
            break
        case 60..69: "B"
            break
        case 40..59: "C"
            break
        case 0..39: "F"
            break
        default : "I"
    }
}

println "The grade is ${calculateGrade(75)}"
println "The grade is ${calculateGrade(62)}"
println "The grade is ${calculateGrade(55)}"
println "The grade is ${calculateGrade(46)}"
println "The grade is ${calculateGrade(35)}"
println "The grade is ${calculateGrade(102)}"
println "The grade is ${calculateGrade(-20)}"

