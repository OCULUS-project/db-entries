package pl.poznan.put.cie.oculus.dbentries.jobs

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import pl.poznan.put.cie.oculus.dbentries.FactEntry
import pl.poznan.put.cie.oculus.dbentries.PremiseEntry

@Document
data class Job (
    @Id
    val id: String,
    val status: JobStatus,
    val facts: Array<FactEntry>,
    var conclusions: Array<PremiseEntry>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Job

        if (id != other.id) return false
        if (!facts.contentEquals(other.facts)) return false
        if (!conclusions.contentEquals(other.conclusions)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + facts.contentHashCode()
        result = 31 * result + conclusions.contentHashCode()
        return result
    }
}