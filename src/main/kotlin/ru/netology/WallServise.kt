package ru.netology

import ru.netology.attachment.*


object WallServise {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var currentID = 0


    fun add(post: Post): Post {
        currentID++
        val post1 = post.copy(id = currentID)
        posts += post1
        return posts.last()
    }


    fun createComment(comment: Comment, postId: Int): Boolean {
        for (post in posts) {
            if (post.id == postId) {
                comments += comment
                return true
            }
        }
        throw PostNotFoundException()
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
        posts = emptyArray()
        currentID = 0
    }
}