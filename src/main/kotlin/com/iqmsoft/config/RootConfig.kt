package com.iqmsoft.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration



@Configuration
@ComponentScan(basePackages = arrayOf("com.iqmsoft"))
open class RootConfig