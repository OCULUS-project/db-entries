package pl.poznan.put.cie.oculus.dbentries.rules

import org.springframework.data.annotation.Id
import pl.poznan.put.cie.oculus.dbentries.FactEntry
import pl.poznan.put.cie.oculus.dbentries.GrfIrfEntry

data class RuleEntry (
        @Id
        val id: String,
        val premises: Array<FactEntry>,
        val conclusion: FactEntry,
        val grfIrfEntry: GrfIrfEntry
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RuleEntry

        if (id != other.id) return false
        if (!premises.contentEquals(other.premises)) return false
        if (conclusion != other.conclusion) return false
        if (grfIrfEntry != other.grfIrfEntry) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + premises.contentHashCode()
        result = 31 * result + conclusion.hashCode()
        result = 31 * result + grfIrfEntry.hashCode()
        return result
    }
}