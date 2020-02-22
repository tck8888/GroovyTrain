package com.tck.groovytrain


import com.google.gson.GsonBuilder
import groovy.json.JsonOutput
/**
 * 关于json的文档地址：http://www.groovy-lang.org/json.html
 * @author tck88*
 * @date 2020/2/22
 */
class JsonDemo {


     static void main(String[] args) {

        def list = [new Person('张三',18),new Person("李四",28)]

        println JsonOutput.prettyPrint(JsonOutput.toJson(list))

        def gson = new GsonBuilder().setPrettyPrinting().create()

        println gson.toJson(list)


    }
}
