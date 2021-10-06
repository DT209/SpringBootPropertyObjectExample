package props.example

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class Component(
    section: Section,
    @Value("\${some.other.value}") anotherValue: String) {

    init {
        println("The whole thing: $section")
        println("Just the deepest part: ${section.subsection.subsubsection}")
        println("Not an object: $anotherValue")
    }
}
