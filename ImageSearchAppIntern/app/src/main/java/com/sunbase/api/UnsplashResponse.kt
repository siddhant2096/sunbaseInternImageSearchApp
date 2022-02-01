package com.sunbase.api

import com.sunbase.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)