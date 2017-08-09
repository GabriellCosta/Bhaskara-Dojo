package gabrielcosta.core

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Test


class DeltaTest {

    val delta: Delta = Delta()

    @Test fun `xˆ2 + 12x – 13 = 0 Should return 196`() {
        assertThat(196.0, equalTo(delta.findDelta(1.0,12.0,-13.0)))
    }

    @Test fun `2x2 – 16x – 18 = 0 Should return 400`() {
        TODO("RESOLVE")
    }

    @Test fun `3xˆ2 -20 Should return 240`() {
        TODO("RESOLVE")
    }

    @Test fun `8xˆ2 Should return 0`() {
        TODO("RESOLVE")
    }

}