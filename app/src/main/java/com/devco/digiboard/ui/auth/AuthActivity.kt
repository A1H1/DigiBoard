package com.devco.digiboard.ui.auth

import com.devco.digiboard.R
import com.devco.digiboard.di.base.BaseActivity

class AuthActivity : BaseActivity() {
    override fun layoutRes() = R.layout.activity_auth
    override fun init() {
        supportFragmentManager.beginTransaction().add(R.id.authFrameLayout,LoginFragment()).commit()

    }


}
