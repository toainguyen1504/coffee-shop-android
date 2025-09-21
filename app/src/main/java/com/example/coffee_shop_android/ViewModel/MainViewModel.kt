package com.example.coffee_shop_android.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.coffee_shop_android.Domain.BannerModel
import com.example.coffee_shop_android.Domain.CategoryModel
import com.example.coffee_shop_android.Domain.ItemsModel
import com.example.coffee_shop_android.Reposiroty.MainRepository

class MainViewModel: ViewModel() {
    private  val repository = MainRepository()

    fun loadBanner(): LiveData<MutableList<BannerModel>> {
        return repository.loadBanner()
    }

    fun loadCategory(): LiveData<MutableList<CategoryModel>> {
        return repository.loadCategory()
    }

    fun loadPopular(): LiveData<MutableList<ItemsModel>> {
        return repository.loadPopular()
    }

    fun loadItems(categoryId: String): LiveData<MutableList<ItemsModel>> {
        return repository.loadItemCategory(categoryId)
    }
}