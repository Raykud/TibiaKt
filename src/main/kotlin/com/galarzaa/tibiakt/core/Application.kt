package com.galarzaa.tibiakt.core

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.serialization.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*

fun main() {
    val client = Client()
    embeddedServer(CIO, port = 8080) {
        install(ContentNegotiation) {
            json()
        }
        routing {
            get("/characters/{name}") {
                val name = call.parameters["name"] ?: return@get call.respondText(
                    "Bad Request",
                    status = HttpStatusCode.BadRequest
                )
                val response = client.fetchCharacter(name)
                call.respond(
                    if (response.data != null) HttpStatusCode.OK else HttpStatusCode.NotFound,
                    response
                )
            }
            get("/worlds") {
                val response = client.fetchWorldOverview()
                call.respond(response)
            }
        }
    }.start(wait = true)
}