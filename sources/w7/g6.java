package w7;

import android.graphics.Path;
public abstract class g6 {
    public static void a(Path path, float f7, float f10) {
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, f7, f10, (f7 * 0.15f) / 2.0f, (0.15f * f10) / 1.212122f, Path.Direction.CW);
    }
}
