open class Shape{
    open fun draw(){
     println("Drawing a shape")

   }
}
class Circle:Shape(){
    override fun draw(){
        println("Drawing a Circle")
    }
}
class Rectangle: Shape(){
     override fun draw(){
        println("Drawing a Rectangle")
    }

}

fun main() {
    var sh =Shape()
    sh.draw()
    var ci = Circle()
    ci.draw()

    var r = Rectangle()
    r.draw()
}