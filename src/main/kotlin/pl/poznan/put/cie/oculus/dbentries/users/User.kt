package pl.poznan.put.cie.oculus.dbentries.users

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User (
    @Id
    val id: String?,
    var type: UserType,
    var login: String,
    var password: String,
    var name: String,
    var email: String
) {
    constructor(type: UserType, login: String, password: String, name: String, email: String)
            : this(null, type, login, password, name, email)
}