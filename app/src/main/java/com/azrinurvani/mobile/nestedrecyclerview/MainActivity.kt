package com.azrinurvani.mobile.nestedrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.azrinurvani.mobile.nestedrecyclerview.adapter.ParentAdapter
import com.azrinurvani.mobile.nestedrecyclerview.databinding.ActivityMainBinding
import com.azrinurvani.mobile.nestedrecyclerview.model.ChildItem
import com.azrinurvani.mobile.nestedrecyclerview.model.ParentItem


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private val parentList = ArrayList<ParentItem>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUI()
        addDataToList()
        val parentAdapter  = ParentAdapter(parentList)
        binding.rvParent.adapter = parentAdapter
    }

    private fun addDataToList() {
        val childItems1 = ArrayList<ChildItem>()
        childItems1.add(ChildItem("Child Title 1",R.drawable.ic_launcher_background))
        childItems1.add(ChildItem("Child Title 2",R.drawable.ic_launcher_background))
        childItems1.add(ChildItem("Child Title 3",R.drawable.ic_launcher_background))
        childItems1.add(ChildItem("Child Title 4",R.drawable.ic_launcher_background))
        childItems1.add(ChildItem("Child Title 5",R.drawable.ic_launcher_background))
        childItems1.add(ChildItem("Child Title 6",R.drawable.ic_launcher_background))
        parentList.add(ParentItem("Title 1",R.drawable.ic_launcher_foreground,childItems1))

        val childItems2 = ArrayList<ChildItem>()
        childItems2.add(ChildItem("Child Title 1",R.drawable.ic_launcher_background))
        childItems2.add(ChildItem("Child Title 2",R.drawable.ic_launcher_background))
        childItems2.add(ChildItem("Child Title 3",R.drawable.ic_launcher_background))
        childItems2.add(ChildItem("Child Title 4",R.drawable.ic_launcher_background))
        childItems2.add(ChildItem("Child Title 5",R.drawable.ic_launcher_background))
        childItems2.add(ChildItem("Child Title 6",R.drawable.ic_launcher_background))
        parentList.add(ParentItem("Title 1",R.drawable.ic_launcher_foreground,childItems2))

        val childItems3 = ArrayList<ChildItem>()
        childItems3.add(ChildItem("Child Title 1",R.drawable.ic_launcher_background))
        childItems3.add(ChildItem("Child Title 2",R.drawable.ic_launcher_background))
        childItems3.add(ChildItem("Child Title 3",R.drawable.ic_launcher_background))
        childItems3.add(ChildItem("Child Title 4",R.drawable.ic_launcher_background))
        childItems3.add(ChildItem("Child Title 5",R.drawable.ic_launcher_background))
        childItems3.add(ChildItem("Child Title 6",R.drawable.ic_launcher_background))
        parentList.add(ParentItem("Title 1",R.drawable.ic_launcher_foreground,childItems3))

        val childItems4 = ArrayList<ChildItem>()
        childItems4.add(ChildItem("Child Title 1",R.drawable.ic_launcher_background))
        childItems4.add(ChildItem("Child Title 2",R.drawable.ic_launcher_background))
        childItems4.add(ChildItem("Child Title 3",R.drawable.ic_launcher_background))
        childItems4.add(ChildItem("Child Title 4",R.drawable.ic_launcher_background))
        childItems4.add(ChildItem("Child Title 5",R.drawable.ic_launcher_background))
        childItems4.add(ChildItem("Child Title 6",R.drawable.ic_launcher_background))
        parentList.add(ParentItem("Title 1",R.drawable.ic_launcher_foreground,childItems4))
    }

    private fun setupUI(){
        binding.apply {
            rvParent.setHasFixedSize(true)
            rvParent.layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}