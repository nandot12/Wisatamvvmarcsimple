package com.udacoding.wisatamvvmarcsimple.model

import com.google.gson.annotations.SerializedName

data class Wisata(
	val status_code: Int? = null,
	val data: List<DataItem>? = null,
	val message: String? = null
)