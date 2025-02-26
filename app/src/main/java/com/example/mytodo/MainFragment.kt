package com.example.mytodo

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class MainFragment : Fragment(R.layout.main_fragment) {
    private val vm: MainViewModel by viewModels()
}