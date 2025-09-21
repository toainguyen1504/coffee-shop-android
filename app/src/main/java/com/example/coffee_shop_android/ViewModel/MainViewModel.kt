package com.example.coffee_shop_android.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.coffee_shop_android.Domain.BannerModel
import com.example.coffee_shop_android.Reposiroty.MainRepository

class MainViewModel: ViewModel() {
    private  val repository = MainRepository()

    fun loadBanner(): LiveData<MutableList<BannerModel>> {

        return repository.loadBanner()
    }
}