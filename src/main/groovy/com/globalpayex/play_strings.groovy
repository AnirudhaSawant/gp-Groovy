package com.globalpayex

def fullName = "Anirudha Sawant"
def msg = 'Good morning'
def addition = "Addition is ${4 + 3}"

def sql = '''
    select username, password
    from users
    where username = 'abc'
'''

println sql

// Indexing
println msg[0]
println msg[3]
println msg[-1]
println msg[-3]

// Substring

println fullName[0..7]
println msg[-4..-1]

for(def v in msg) {
    println v
}

println fullName.toUpperCase()
println msg.capitalize()

println msg.startsWith("Good")
println msg.endsWith("night")
println msg.contains("ood")

println msg.count("Good")

def age = '22'
println age.isNumber()

println fullName.reverse()
println fullName.size()

def studentData = "            anirudha,m,10,90                        "
println studentData.strip()

def maliciousData = "        "
println maliciousData.isAllWhitespace()

def m1 = "anirudha sawant"
def m2 = "anirudha"
def m3 = m2 + " sawant"
def m4 = "anirudha sawant"

println m1
println m3

println m1 == m3
println m1 === m3
println m1 === m4

def a = 5
def b = 4 + 1
println a == b