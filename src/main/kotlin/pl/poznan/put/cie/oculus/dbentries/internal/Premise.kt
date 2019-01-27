package pl.poznan.put.cie.oculus.dbentries.internal

open class Premise (
    val head: String,
    var set: List<String>,
    var conjunction: Boolean
)