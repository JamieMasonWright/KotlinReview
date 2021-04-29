

fun validatePassword(password : String) = password.length >= 10



fun main(){
    val email : String? = "email@email.com"
    val password : String? = "password"

    fun validateString(input: String?, inputType: String) =
        if(input == null || input.isBlank()){
            false
        }else if(inputType == "Password"){
            input.length >= 10
        }else if(inputType == "Email"){
            input.contains("@")
        }else{
            println("Cannot verify this input")
            false
        }

    fun validateString(input: String?, validator: (String) -> Boolean) =
        if(input == null || input.isBlank()){
            false
        }else{
            validator(input)
        }


    validateString("Hello World", "Welcome Message")

    val isValidEmail = validateString(email, "Email")
    println(isValidEmail)

    val isValidPassword = validateString(password, ::validatePassword)
    println(isValidPassword)

    val validator: (String?) -> Boolean = {input ->
        input != null && validatePassword(input)
    }
    println(validator)
}