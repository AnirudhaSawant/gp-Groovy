package com.globalpayex

String.metaClass.csvify={
    delegate.replaceAll " ", ","
}

def data ='anirudha m 12 90'
println data.csvify()

