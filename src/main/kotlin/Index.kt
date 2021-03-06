import it.ldsoftware.wrappers.firebase.FunctionBuilder

external fun require(module: String): dynamic
external val exports: dynamic

fun main() {
    val functions = require("firebase-functions").uncheckedCast<FunctionBuilder>()

    exports.helloWorld = functions.https.onRequest { request, response ->
        console.log("Request headers: ${request.headers}")
        console.log("Request body: ${request.body}")

        response.send("Hello from firebase!")
    }
}
