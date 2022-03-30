package ru.netology.attachment

data class VideoAttachment(override val type: String = "video", val video: Video?) : Attachments(type) {
}