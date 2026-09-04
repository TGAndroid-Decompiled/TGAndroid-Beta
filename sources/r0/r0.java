package r0;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
public abstract class r0 {
    public static WindowInsetsAnimation.Bounds a(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static WindowInsetsAnimation b(int i10, long j3, Interpolator interpolator) {
        return new WindowInsetsAnimation(i10, interpolator, j3);
    }

    public static void c() {
    }
}
