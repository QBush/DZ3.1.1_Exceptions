package ru.netology

import ru.netology.attachment.*

fun main() {

    val video1: VideoAttachment? = null
    val audio1: AudioAttachment? = null
    val link1: LinkAttachment? = null
    val note1: NoteAttachment? = null
    val photo1: PhotoAttachment? = null

    val attachment1: Array<Attachments> = arrayOf(
        Video("video", video1),
        Audio("audio", audio1),
        Link("link", link1),
        Note("note", note1),
        Photo("photo", photo1)
    )

    WallServise.add(
        Post(
            ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
            replyPostId = 24, friendsOnly = true, comments = null, copyright = null,
            likes = null, reposts = null, postType = "postType", signerId = 6, canPin = true,
            canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
            donut = null, postponedId = "postponedId", postSource = null, geo = null, copyHistory = null,
            attachment = attachment1
        )
    )

    WallServise.add(
        Post(
            ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
            replyPostId = 24, friendsOnly = true, comments = null, copyright = null,
            likes = null, reposts = null, postType = "postType", signerId = 6, canPin = true,
            canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
            donut = null, postponedId = "postponedId", postSource = null, geo = null, copyHistory = null,
            attachment = attachment1
        )
    )

    WallServise.add(
        Post(
            ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
            replyPostId = 24, friendsOnly = true, comments = null, copyright = null,
            likes = null, reposts = null, postType = "postType", signerId = 6, canPin = true,
            canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
            donut = null, postponedId = "postponedId", postSource = null, geo = null, copyHistory = null,
            attachment = attachment1
        )
    )
}
