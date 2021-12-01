@file:UseSerializers(InstantSerializer::class)

package com.galarzaa.tibiakt.core.models.bazaar

import com.galarzaa.tibiakt.core.utils.InstantSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import java.time.Instant

/**
 * An auction's details
 *
 * @property hitPoints The maximum hitpoint of the character.
 * @property mana The maximum mana of the character.
 * @property capacity The maximum capacity of the character.
 * @property speed The speed of the character.
 * @property blessingsCount The number of blessings the character has.
 * @property mountsCount The number of mounts the character has.
 * @property outfitsCount the total number of outfits the character has.
 * @property titlesCount The total number of unlocked titles.
 * @property skills The current skill levels of the character.
 * @property creationDate The date and time when the character was created.
 * @property experience The total experience of the character.
 * @property gold The total gold the character has.
 * @property achievementPoints The achievement points of the character.
 * @property regularWorldTransfersAvailable The date when regular world transfers will be available again for this user.
 * @property charmExpansion Whether this character has a charm expansion or not.
 * @property availableCharmPoints The total charm points the character has for spending.
 * @property spentCharmPoints The total charm points that have been spent.
 * @property dailyRewardStreak The current daily rewards streak.
 * @property huntingTaskPoints The total hunting task points.
 * @property permanentHuntingTaskSlots The total number of permanent hunting task slots the character has.
 * @property permanentPreySlots The total number of permanent prey slots.
 * @property preyWildcards The number of prey wildcards.
 * @property hirelings The total hirelings this character has.
 * @property hirelingJobs The total hireling jobs the character has available.
 * @property hirelingOutfits The total hireling outfits the character has available.
 * @property items The summary of items of the character.
 * @property storeItems The summary of store items of the character.
 * @property mounts The mounts the character has unlocked.
 * @property storeMounts The store mounts the character has purchased.
 * @property outfits The outfits the character has unlocked.
 * @property storeOutfits The store outfits the character has purchased.
 * @property familiars The familiars the character has unlocked.
 * @property blessingsCount The blessings the character has.
 * @property imbuements The list of imbuements the character has unlocked.
 * @property charms The list of charms the character has unlocked.
 * @property completedCyclopediaMapAreas The map areas the character has fully discovered.
 * @property completedQuestLines The quest lines the character has unlocked.
 * @property titles The list of titles the character has unlocked.
 * @property achievements The list of achievements the character has unlocked.
 * @property bestiaryProgress The list of bestiary creatures and their progress.
 */
@Serializable
data class AuctionDetails(
    val hitPoints: Int,
    val mana: Int,
    val capacity: Int,
    val speed: Int,
    val blessingsCount: Int,
    val mountsCount: Int,
    val outfitsCount: Int,
    val titlesCount: Int,
    val skills: AuctionSkills,
    val creationDate: Instant,
    val experience: Long,
    val gold: Long,
    val achievementPoints: Int,
    val regularWorldTransfersAvailable: Instant?,
    val charmExpansion: Boolean,
    val availableCharmPoints: Int,
    val spentCharmPoints: Int,
    val dailyRewardStreak: Int,
    val huntingTaskPoints: Int,
    val permanentHuntingTaskSlots: Int,
    val permanentPreySlots: Int,
    val preyWildcards: Int,
    val hirelings: Int,
    val hirelingJobs: Int,
    val hirelingOutfits: Int,
    val items: ItemSummary,
    val storeItems: ItemSummary,
    val mounts: Mounts,
    val storeMounts: Mounts,
    val outfits: Outfits,
    val storeOutfits: Outfits,
    val familiars: Familiars,
    val blessings: List<BlessingEntry> = emptyList(),
    val imbuements: List<String> = emptyList(),
    val charms: List<CharmEntry> = emptyList(),
    val completedCyclopediaMapAreas: List<String> = emptyList(),
    val completedQuestLines: List<String> = emptyList(),
    val titles: List<String> = emptyList(),
    val achievements: List<AchievementEntry> = emptyList(),
    val bestiaryProgress: List<BestiaryEntry> = emptyList(),
)