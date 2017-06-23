package example

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom
import shared.SharedMessages

import scala.scalajs.js
import scala.scalajs.js.|

object ScalaJSExample extends js.JSApp {

  case class Props(/* TODO */)

//  val myComponent =
//    ScalaComponent.builder[Props]("MyComponent")
//  |
//
//  val mainHeader =
//    ScalaComponent.builder[String]("MainHeader")
//      .render_P(name => <.h1("I Am The Header"))
//      .build
//
  val mainDiv = ScalaComponent.builder[String]("MainDiv")
    .render_P(name =>
      <.div("I Am The Main Div",
        <.h2("and h2 here!  " + SharedMessages.timeNow)))
    .build

  val timeFn = () => mainDiv("toodles").renderIntoDOM(dom.document.getElementById("root"))

//
//  val Hello =
//    ScalaComponent.builder[String]("Hello")
//      .render_P(name => <.div("Hello there ", name))
//      .build

  def main(): Unit = {
    dom.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks

    scala.scalajs.js.Dynamic.global.setInterval(timeFn, 10)
//    mainDiv("toodles").renderIntoDOM(dom.document.getElementById("root"))
  }



}
