package furhatos.app.subsystem3

import furhatos.app.subsystem3.flow.*
import furhatos.skills.Skill
import furhatos.flow.kotlin.*

class Subsystem3Skill : Skill() {
    override fun start() {
        Flow().run(Idle)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
