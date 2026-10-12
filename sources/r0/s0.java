package r0;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
public abstract class s0 {
    public static WindowInsetsAnimation.Bounds a(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static WindowInsetsAnimation b(int i10, long j10, Interpolator interpolator) {
        return new WindowInsetsAnimation(i10, interpolator, j10);
    }

    public static void c() {
    }
}
