package ru.netology.attachment

data class LinkAttachment(override val type: String = "link", val link: Link?) : Attachments(type) {
}