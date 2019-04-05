package webserver

import io.javalin.Context

fun accueil(ctx: Context) {
    ctx.html(
        {}.javaClass.getResource("/accueil.html").readText()
    )
}
