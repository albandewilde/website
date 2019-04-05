package webserver

import io.javalin.Javalin
import io.javalin.Context
import io.javalin.apibuilder.ApiBuilder.*

fun main() {
    val serv = Javalin.create()
        .enableStaticFiles("/public")
        .requestLogger({ctx: Context, timeMs -> println(
            "Method: ${ctx.method() ?: "no method"}, Path: ${ctx.path()}, Query: ${ctx.queryString()}"
        )})
        .start(7000)

    serv.routes{
        path("/") {
            get(::accueil)
        }
    }
}
