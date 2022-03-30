package ru.netology.attachment

data class NoteAttachment(override val type: String = "note", val note: Note?) : Attachments(type) {
}