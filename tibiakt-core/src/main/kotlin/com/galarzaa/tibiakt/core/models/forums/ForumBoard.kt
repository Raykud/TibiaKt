@file:UseSerializers(InstantSerializer::class)

package com.galarzaa.tibiakt.core.models.forums

import com.galarzaa.tibiakt.core.models.Paginated
import com.galarzaa.tibiakt.core.serializers.InstantSerializer
import com.galarzaa.tibiakt.core.utils.getForumBoardUrl
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
data class ForumBoard(
    val name: String,
    override val boardId: Int,
    val section: String,
    override val currentPage: Int,
    override val totalPages: Int,
    override val resultsCount: Int,
    override val entries: List<ForumEntry>,
) : Paginated<ForumEntry>, BaseForumBoard {

    override val url = getForumBoardUrl(boardId, currentPage)
}

