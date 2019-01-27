package pl.poznan.put.cie.oculus.dbentries.jobs

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import pl.poznan.put.cie.oculus.dbentries.internal.Fact
import pl.poznan.put.cie.oculus.dbentries.internal.Premise
import java.time.Instant

@Document
data class Job (
    @Id
    val id: String?,
    var status: JobStatus,
    var owner: String,
    var patient: String,
    var created: Instant,
    var updated: Instant,
    var facts: List<Fact>,
    var conclusions: List<Premise>

    ) {
    constructor(status: JobStatus, owner: String, patient: String, created: Instant, updated: Instant, facts: List<Fact>, conclusions: List<Premise>)
            : this(null, status, owner, patient, created, updated, facts, conclusions)

    constructor(status: JobStatus, owner: String, patient: String, facts: List<Fact>, conclusions: List<Premise>)
            : this(null, status, owner, patient, Instant.now(), Instant.now(), facts, conclusions)
}