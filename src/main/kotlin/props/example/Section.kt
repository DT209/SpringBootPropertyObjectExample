package props.example

import java.net.URL
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

/**
section.name=Sample Property to Object conversion
section.path= /some/path/goes/here
section.url=https://www.google.com

section.subsection.property=12
section.subsection.baseUrl=https://www.yahoo.com

section.subsection.subsubsection.val1=Thing1
section.subsection.subsubsection.val2=Thing2

some.other.value = another value
 */
@ConstructorBinding
@ConfigurationProperties("section")
data class Section(
    val name: String,
    val path: String,
    val url: URL,

    val subsection:Subsection
)
{
    data class Subsection (
        val property: String,
        val baseUrl: URL,
        val subsubsection: SubSubsection
        ) {
        data class SubSubsection (
            val val1 : String,
            val val2: String
        )
    }
}



