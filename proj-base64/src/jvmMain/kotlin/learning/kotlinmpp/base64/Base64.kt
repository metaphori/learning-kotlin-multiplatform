package learning.kotlinmpp.base64

import learning.kotlinmpp.base64.Base64Encoder

actual object Base64Factory {
    actual fun createEncoder(): Base64Encoder = JvmBase64Encoder
}

object JvmBase64Encoder : Base64Encoder {
    override fun encode(src: ByteArray): ByteArray = java.util.Base64.getEncoder().encode(src)
}