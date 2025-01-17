package com.alisavran.jokes.model

data class Joke (
    val error : Boolean,
    val category : String,
    val type : String,
    val setup : String? = null,
    val delivery : String? = null,
    val joke : String? = null,
    val flags: flags,
    val id : Long,
    val safe : Boolean,
    val lang: String

    )

data class flags(
    val nsfw: Boolean,
    val religious: Boolean,
    val political : Boolean,
    val racist : Boolean,
    val sexist : Boolean,
    val explicit : Boolean)

