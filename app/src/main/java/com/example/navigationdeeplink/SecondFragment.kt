package com.example.navigationdeeplink

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.NavGraph
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import kotlin.random.Random

class SecondFragment : Fragment() {

    private val shardViewModel: SecondViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        shardViewModel.onGetTypeSecond.observe(viewLifecycleOwner) { isType1 ->
            if (isType1) {
                val graph = findNavController().graph
                val carInstallmentNavGraph =
                    graph.findNode(R.id.nav_second) as NavGraph
                carInstallmentNavGraph.setStartDestination(R.id.secondTypeOneFragment)
//                findNavController().setGraph(carInstallmentNavGraph, null)
                findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToSecondTypeOneFragment())
            } else {
                val graph = findNavController().graph
                val carInstallmentNavGraph =
                    graph.findNode(R.id.nav_second) as NavGraph
                carInstallmentNavGraph.setStartDestination(R.id.secondTypeTwoFragment)
//                findNavController().setGraph(carInstallmentNavGraph, null)
                findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToSecondTypeTwoFragment())
            }
        }
    }
}