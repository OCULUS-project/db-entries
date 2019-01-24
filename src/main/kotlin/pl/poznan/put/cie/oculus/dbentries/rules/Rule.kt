package pl.poznan.put.cie.oculus.dbentries.rules

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import pl.poznan.put.cie.oculus.dbentries.GrfIrf
import pl.poznan.put.cie.oculus.dbentries.Premise

@Document
data class Rule (
        @Id
        val id: String,
        var premises: List<Premise>,
        var conclusion: Premise,
        var grfIrf: GrfIrf
)