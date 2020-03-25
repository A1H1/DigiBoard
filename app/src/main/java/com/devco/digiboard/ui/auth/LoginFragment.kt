package com.devco.digiboard.ui.auth

import com.devco.digiboard.R
import com.devco.digiboard.di.base.BaseFragment
import com.google.firebase.auth.FirebaseAuth


class LoginFragment : BaseFragment(){

    private lateinit var auth: FirebaseAuth

    override fun layoutRes()= R.layout.fragment_login
    override fun init() {
        auth = FirebaseAuth.getInstance()


    }


}