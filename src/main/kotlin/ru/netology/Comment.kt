package ru.netology

import ru.netology.attachment.Attachments

class Comment(
    val id: Int,
    val fromId: Int = 0,
    val date: Int = 0,
    val text: String? = null,
    val donut: String? = null,
    val replyToUser: Int = 0,
    val replyToComment: Int = 0,
    val attachments: Attachments? = null
)
