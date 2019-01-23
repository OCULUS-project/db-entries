package pl.poznan.put.cie.oculus.dbentries.rules

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import pl.poznan.put.cie.oculus.dbentries.FactEntry
import pl.poznan.put.cie.oculus.dbentries.GrfIrfEntry
import pl.poznan.put.cie.oculus.dbentries.PremiseEntry

@Document
data class Rule (
        @Id
        val id: String,
        val premises: Array<PremiseEntry>,
        val conclusion: PremiseEntry,
        val grfIrf: GrfIrfEntry
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Rule

        if (id != other.id) return false
        if (!premises.contentEquals(other.premises)) return false
        if (conclusion != other.conclusion) return false
        if (grfIrf != other.grfIrf) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + premises.contentHashCode()
        result = 31 * result + conclusion.hashCode()
        result = 31 * result + grfIrf.hashCode()
        return result
    }
}