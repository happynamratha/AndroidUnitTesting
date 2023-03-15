package com.example.androidunittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test
class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInputs(
            username = "",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }


    @Test
    fun `valid username and repeated pwd are same returns true`(){
        val result = RegistrationUtil.validateRegistrationInputs(
            username = "NamrathaAgoogleemployee",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isTrue()
    }

}