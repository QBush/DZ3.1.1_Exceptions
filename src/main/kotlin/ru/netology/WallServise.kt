package ru.netology

object WallServise {
    private var posts = emptyArray<Post>()
    private var currentID = 0

    fun main() {
        WallServise.add(Post(ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
            replyPostId = 24, friendsOnly = true, comments = null, copyright = null,
            likes = null, reposts = null, postType = "postType", signerId = 6, canPin = true,
            canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
            donut = null, postponedId = "postponedId", postSource = null, geo = null, copyHistory = null))

        WallServise.add(Post(ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
            replyPostId = 24, friendsOnly = true, comments = null, copyright = null,
            likes = null, reposts = null, postType = "postType", signerId = 6, canPin = true,
            canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
            donut = null, postponedId = "postponedId", postSource = null, geo = null, copyHistory = null))

        WallServise.add(Post(ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
            replyPostId = 24, friendsOnly = true, comments = null, copyright = null,
            likes = null, reposts = null, postType = "postType", signerId = 6, canPin = true,
            canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
            donut = null, postponedId = "postponedId", postSource = null, geo = null, copyHistory = null))
    }

    fun add(post: Post): Post {
        currentID++
        val post = post.copy(id = currentID)
        posts += post
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