package pl.poznan.put.cie.oculus.dbentries.patients

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Patient (
    @Id
    val id: String?,
    var name: String
) {
    constructor(name: String) : this(null, name)
}