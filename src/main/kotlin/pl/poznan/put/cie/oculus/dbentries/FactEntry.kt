package pl.poznan.put.cie.oculus.dbentries

class FactEntry (
    head: String,
    set: Array<String>,
    conjunction: Boolean,
    val grfIrf: GrfIrfEntry
) : PremiseEntry(head, set, conjunction)