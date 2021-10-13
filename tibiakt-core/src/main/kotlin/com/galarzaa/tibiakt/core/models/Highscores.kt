@file:UseSerializers(InstantSerializer::class)

package com.galarzaa.tibiakt.core.models

import com.galarzaa.tibiakt.core.enums.HighscoresBattlEyeType
import com.galarzaa.tibiakt.core.enums.HighscoresCategory
import com.galarzaa.tibiakt.core.enums.HighscoresProfession
import com.galarzaa.tibiakt.core.enums.HighscoresPvpType
import com.galarzaa.tibiakt.core.utils.InstantSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import java.time.Instant

@Serializable
data class Highscores(
    val world: String?,
    val category: HighscoresCategory,
    val vocation: HighscoresProfession,
    val worldTypes: Set<HighscoresPvpType> = emptySet(),
    val battlEyeType: HighscoresBattlEyeType,
    val lastUpdate: Instant,
    val currentPage: Int,
    val totalPages: Int,
    val resultsCount: Int,
    val entries: List<HighscoresEntry> = emptyList()
)

