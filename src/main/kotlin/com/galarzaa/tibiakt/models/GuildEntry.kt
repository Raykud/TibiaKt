package com.galarzaa.tibiakt.models

import kotlinx.serialization.Serializable

@Serializable
data class GuildEntry(
    override val name: String,
    val description: String?,
    val logoUrl: String,
    val isActive: Boolean
) : BaseGuild