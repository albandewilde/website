import io.javalin.Javalin

fun main() {
    val serv = Javalin.create().start(7000)
    serv.get("/") {ctx -> ctx.result("Hello World!")}
}
