package com.ssafy.tmbg.data.auth.response

data class ErrorResponse(
    val status : String,
    val message : String,
    val error : String
)
