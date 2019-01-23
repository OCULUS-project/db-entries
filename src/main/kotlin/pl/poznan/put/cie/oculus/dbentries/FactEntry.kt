package pl.poznan.put.cie.oculus.dbentries

import org.springframework.lang.Nullable

data class FactEntry (
    val head: String,
    val set: Array<String>,
    @Nullable
    val grfIrf: GrfIrfEntry,
    val conjunction: Boolean
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FactEntry

        if (head != other.head) return false
        if (!set.contentEquals(other.set)) return false
        if (grfIrf != other.grfIrf) return false
        if (conjunction != other.conjunction) return false

        return true
    }

    override fun hashCode(): Int {
        var result = head.hashCode()
        result = 31 * result + set.contentHashCode()
        result = 31 * result + grfIrf.hashCode()
        result = 31 * result + conjunction.hashCode()
        return result
    }
}