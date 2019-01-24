package pl.poznan.put.cie.oculus.dbentries

class Fact (
    head: String,
    set: List<String>,
    conjunction: Boolean,
    val grfIrf: GrfIrf
) : Premise(head, set, conjunction)