package furhatos.app.subsystem3.nlu

import furhatos.nlu.Intent
import furhatos.util.Language

class openpalm: Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("Open palm","Open Farm")
    }
}

class opendorsal: Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("Open dorsal")
    }
}
class threefingerpalm: Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("three fingers palm","3 fingers palm","three fingers Farm","3 fingers farm","three finger bomb","3 finger bomb")
    }
}
class threefingerdorsal: Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("three finger dorsal","3 finger dorsal")
    }
}

class fistpalm: Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("Fist palm","fist bump","fist pump","fist bomb")
    }
}

class fistdorsal: Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("Fist dorsal","first dorsal")
    }
}
class stop: Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("stop")
    }
}




