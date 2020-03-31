package learning.kotlinmpp

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTests {
    @Test
    fun testMe() {
        println("Sample common test")
        assertTrue(Sample().checkMe() > 0)
    }
}