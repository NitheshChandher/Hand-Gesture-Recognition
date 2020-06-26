package furhatos.app.subsystem3.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.app.subsystem3.nlu.*
import furhatos.gestures.Gestures

val Start : State = state(Interaction) {
    onEntry {
        furhat.ask("Hi there, I'm Mike Bean and its time for the football action for you. " +
                "I'm here in the commentary booth to give you live commentary about the match based on Referee's hand gesture. " +
                "Shall we go to the match ?"
        )
        goto(commentary())
    }
    onResponse<Yes> {
        furhat.say ("Good")
        furhat.gesture(Gestures.Smile(duration=2.0, strength = 1.0))
        goto(commentary())
    }
    onResponse<No> {
        furhat.gesture(Gestures.ExpressSad(duration=3.0, strength = 0.5))
        furhat.say ("Thanks for watching football. We'll see you next weekend")
    }
}

fun commentary() : State = state{
    onEntry {
        furhat.ask(" ")
    }

    onResponse<openpalm>{
        furhat.say("Let's start the game. We have two teams ready at the centre of the court")
        furhat.gesture(Gestures.BigSmile(duration=2.0, strength = 1.0))
        goto(commentary())
    }

    onResponse<opendorsal>{
        furhat.say("The Referee blows the whistle for Full time. What a game of football we have witnessed today")
        furhat.gesture(Gestures.Smile(duration = 2.0, strength = 1.0))
        goto(commentary())
    }

    onResponse<threefingerpalm>{
        furhat.say("The player was shown yellow card for his reckless challenge.")
        furhat.gesture(Gestures.BrowRaise(duration=2.0, strength = 1.0))
        goto(commentary())
    }

    onResponse<threefingerdorsal>{
        furhat.say("The referee has blown straight away and that's a free kick. He's got to go. Red Card!! You can't dive in like that. Reckless")
        furhat.gesture(Gestures.ExpressAnger(duration=2.0, strength = 1.0))
        goto(commentary())
    }

    onResponse<fistpalm>{
        furhat.say("Goal!!! what a strike it was ? He went pass all the defenders and shoots to the top corner")
        furhat.gesture(Gestures.Surprise(duration = 2.0, strength = 1.0))
        goto(commentary())
    }

    onResponse<fistdorsal>{
        furhat.say("What a goal ? But it's not gonna count. Offside given by the linesman")
        furhat.gesture(Gestures.ExpressSad(duration=3.0, strength = 0.5))
        goto(commentary())
    }

    onReentry {
        furhat.say("The Referee's gesture was not clear")
        furhat.gesture(Gestures.ExpressSad(duration=3.0, strength = 0.5))
        goto(commentary())
    }
    onResponse<stop> {
        furhat.say("Thanks for watching football. We'll see you next weekend")
    }
}
