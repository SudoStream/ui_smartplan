package example

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom
import shared.SharedMessages

import scala.scalajs.js
import scala.scalajs.js.|

object ScalaJSExample extends js.JSApp {

  case class Props(/* TODO */)

  val myComponent =
    ScalaComponent.builder[Props]("MyComponent")
  |
  val Hello =
    ScalaComponent.builder[String]("Hello")
      .render_P(name => <.div("Hello there ", name))
      .build


  def main(): Unit = {
    dom.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks

    ////

    //    ReactDOM.render(router(), dom.document.getElementById("root"))
    //    ReactDOM.render(dom.document.getElementById("root"))


    // Usage:


    val hi = Hello("Draconus")

    hi.renderIntoDOM(dom.document.getElementById("root"))
  }
}
