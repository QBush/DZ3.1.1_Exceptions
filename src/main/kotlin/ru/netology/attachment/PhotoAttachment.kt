package ru.netology.attachment

class PhotoAttachment(type: String = "photo", val photo: Photo?) : Attachments(type) {
}