package ru.netology

import org.junit.Assert.*
import org.junit.Test
import ru.netology.*

class WallServiseTest {

    @Test
    fun addTest() {
        WallServise.clear()
        var post = Post(
            ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
            replyPostId = 24, friendsOnly = true, comments = "Comments", copyright = "Copyright",
            likes = "Likes", reposts = "Reposts", postType = "postType", signerId = 6, canPin = true,
            canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
            donut = "Donut", postponedId = "postponedId"
        )

        val result = WallServise.add(post)
        assertNotEquals(result.id, 0)

    }

    @Test
    fun updateTestTrue() {
        WallServise.clear()
        var post1 = Post(
            ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
            replyPostId = 24, friendsOnly = true, comments = "Comments", copyright = "Copyright",
            likes = "Likes", reposts = "Reposts", postType = "postType", signerId = 6, canPin = true,
            canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
            donut = "Donut", postponedId = "postponedId"
        )
        var post2 = Post(
            ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
            replyPostId = 24, friendsOnly = true, comments = "Comments", copyright = "Copyright",
            likes = "Likes", reposts = "Reposts", postType = "postType", signerId = 6, canPin = true,
            canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
            donut = "Donut", postponedId = "postponedId"
        )

        WallServise.add(post1)
        WallServise.add(post2)

        val result = WallServise.update(
            Post(
                id = 2,
                ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
                replyPostId = 24, friendsOnly = true, comments = "Comments", copyright = "Copyright",
                likes = "Likes", reposts = "Reposts", postType = "postType", signerId = 6, canPin = true,
                canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
                donut = "Donut", postponedId = "postponedId"
            )
        )

        assertTrue(result)

    }

    @Test
    fun updateTestFalse() {
        WallServise.clear()
        var post1 = Post(
            ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
            replyPostId = 24, friendsOnly = true, comments = "Comments", copyright = "Copyright",
            likes = "Likes", reposts = "Reposts", postType = "postType", signerId = 6, canPin = true,
            canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
            donut = "Donut", postponedId = "postponedId"
        )
        var post2 = Post(
            ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
            replyPostId = 24, friendsOnly = true, comments = "Comments", copyright = "Copyright",
            likes = "Likes", reposts = "Reposts", postType = "postType", signerId = 6, canPin = true,
            canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
            donut = "Donut", postponedId = "postponedId"
        )

        WallServise.add(post1)
        WallServise.add(post2)
        val result = WallServise.update(
            Post(
                id = 3, ownerId = 2, fromId = 3, createdBy = 5, date = 25, text = "text", replyOwnerId = 2,
                replyPostId = 24, friendsOnly = true, comments = "Comments", copyright = "Copyright",
                likes = "Likes", reposts = "Reposts", postType = "postType", signerId = 6, canPin = true,
                canDelete = true, canEdit = true, isPinned = true, markedAsAds = true, isFavorite = true,
                donut = "Donut", postponedId = "postponedId"
            )
        )

        assertFalse(result)
    }
}