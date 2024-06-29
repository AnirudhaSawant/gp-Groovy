package com.globalpayex

def studentData = [
        Tuple.tuple("anirudha", 'm', 90),
        Tuple.tuple("jane", 'f', 80),
        Tuple.tuple("virat", 'm', 95),
        Tuple.tuple("smiti", 'f', 70),
]

def l1 = studentData
        .findAll {it.v2 == 'm'}
        .collect {Tuple.tuple(it.v1,it.v3)}

println l1

