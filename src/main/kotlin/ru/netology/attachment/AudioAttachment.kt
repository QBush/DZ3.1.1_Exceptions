package ru.netology.attachment

data class AudioAttachment(override val type: String = "audio", val audio: Audio?) : Attachments(type) {
}