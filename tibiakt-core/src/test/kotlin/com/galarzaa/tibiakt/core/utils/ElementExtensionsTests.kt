package com.galarzaa.tibiakt.core.utils

import com.galarzaa.tibiakt.TestResources.getResource
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.jsoup.Jsoup

class ElementExtensionsTests : StringSpec({
    "Parse a form with checkboxes"{
        val content: String = getResource("utils/formWithCheckboxes.txt")
        val formElement = Jsoup.parse(content).selectFirst("form")
        val formData = formElement!!.formData()
        formData.values["filter_begin_day"] shouldBe "25"
    }
})