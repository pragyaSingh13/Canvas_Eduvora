import android.graphics.Path

class Stroke(
    var color: Int,
    var strokeWidth: Int, path: Path
) {
    // a Path object to
    // represent the path drawn
    var path: Path

    // constructor to initialise the attributes
    init {
        strokeWidth = strokeWidth
        this.path = path
    }
}