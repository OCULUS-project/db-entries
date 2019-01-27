package pl.poznan.put.cie.oculus.dbentries.internal

class Fact (
    head: String,
    set: List<String>,
    conjunction: Boolean,
    var grfIrf: GrfIrf
) : Premise(head, set, conjunction)