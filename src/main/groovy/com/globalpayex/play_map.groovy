package com.globalpayex

def mpp = [:]
def empp = [E001:'anirudha',E002:'jane']

// adding a new entry into the map
empp['E003'] = 'rahul'

println empp

// Updating the existing entry
empp['E002'] = 'jill'
println empp

//removing an entry
empp.remove('E003')
println empp

// other functions
println empp.size()
println empp.keySet()
println empp.values()

//iterations
for(def entry in empp) {
    println "Emp id: $entry.key\nEmp name: $entry.value"
}

println 'E003' in empp
println 'E001' in empp