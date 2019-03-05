package com.udacoding.wisatamvvmarcsimple.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.udacoding.wisatamvvmarcsimple.R
import com.udacoding.wisatamvvmarcsimple.adapter.WisataAdapter
import com.udacoding.wisatamvvmarcsimple.model.DataItem
import kotlinx.android.synthetic.main.wisata_fragment.*

class WisataFragment : Fragment() {

    companion object {
        fun newInstance() = WisataFragment()
    }

    private lateinit var viewModel: WisataViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.wisata_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WisataViewModel::class.java)

        viewModel.getStatus().observe(this, Observer {
            t ->
            if(t ?: true){
                list.visibility = View.GONE
                textStatus.visibility = View.VISIBLE
            }else
            {
                list.visibility = View.VISIBLE
                textStatus.visibility = View.GONE
            }

        })

        viewModel.setData().observe(this, Observer {
            t ->
            t?.data?.let { showData(it) }
        })
    }

    private fun showData(data: List<DataItem>) {
        list.adapter = WisataAdapter(data)

    }

}
