package com.udacoding.wisatamvvmarcsimple.model

import com.google.gson.annotations.SerializedName

data class DataItem(
	val lokasi: String? = null,
	val id: String? = null,
	val deskripsi: String? = null,
	val nama_tempat: String? = null,
	val gambar: String? = null
)