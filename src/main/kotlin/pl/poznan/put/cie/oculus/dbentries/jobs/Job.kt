package pl.poznan.put.cie.oculus.dbentries.jobs

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import pl.poznan.put.cie.oculus.dbentries.Fact
import pl.poznan.put.cie.oculus.dbentries.Premise

@Document
data class Job (
    @Id
    val id: String,
    val status: JobStatus,
    val facts: List<Fact>,
    var conclusions: List<Premise>
)