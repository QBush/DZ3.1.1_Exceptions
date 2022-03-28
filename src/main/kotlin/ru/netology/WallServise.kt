package ru.netology

import ru.netology.attachment.*

object WallServise {
    private var posts = emptyArray<Post>()
    private var currentID = 0

    fun main() {
        WallServise.add(
            Post(
                ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
                replyPostId = 24, friendsOnly = true, comments = null, copyright = null,
                likes = null, reposts = null, postType = "postType", signerId = 6, canPin = true,
                canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
                donut = null, postponedId = "postponedId", postSource = null, geo = null, copyHistory = null,
                attachment = null
            )
        )

        WallServise.add(
            Post(
                ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
                replyPostId = 24, friendsOnly = true, comments = null, copyright = null,
                likes = null, reposts = null, postType = "postType", signerId = 6, canPin = true,
                canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
                donut = null, postponedId = "postponedId", postSource = null, geo = null, copyHistory = null,
                attachment = null
            )
        )

        WallServise.add(
            Post(
                ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
                replyPostId = 24, friendsOnly = true, comments = null, copyright = null,
                likes = null, reposts = null, postType = "postType", signerId = 6, canPin = true,
                canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
                donut = null, postponedId = "postponedId", postSource = null, geo = null, copyHistory = null,
                attachment = null
            )
        )

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
        println(attachment1)

    }

    fun add(post: Post): Post {
        currentID++
        val post1 = post.copy(id = currentID)
        posts += post1
        return posts.last()
    }


    fun update(currentPost: Post): Boolean {
        for (post in posts) {
            if (post.id == currentPost.id) {
                post.copy(
                    fromId = currentPost.fromId,
                    createdBy = currentPost.createdBy,
                    text = currentPost.text,
                    replyOwnerId = currentPost.replyOwnerId,
                    replyPostId = currentPost.replyPostId,
                    friendsOnly = currentPost.friendsOnly,
                    comments = currentPost.comments,
                    copyright = currentPost.copyright,
                    likes = currentPost.likes,
                    reposts = currentPost.reposts,
                    postType = currentPost.postType,
                    signerId = currentPost.signerId,
                    canPin = currentPost.canPin,
                    canDelete = currentPost.canDelete,
                    canEdit = currentPost.canEdit,
                    isPinned = currentPost.isPinned,
                    markedAsAds = currentPost.markedAsAds,
                    isFavorite = currentPost.isFavorite,
                    donut = currentPost.donut,
                    postponedId = currentPost.postponedId
                )
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray<Post>()
        currentID = 0
    }
}