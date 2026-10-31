package r0;

import android.view.WindowInsetsAnimation;
import android.widget.FrameLayout;
public final class s0 extends t0 {
    public final WindowInsetsAnimation e;

    public s0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, 0L, null);
        this.e = windowInsetsAnimation;
    }

    public static i0.c e(WindowInsetsAnimation.Bounds bounds) {
        return i0.c.c(bounds.getUpperBound());
    }

    public static i0.c f(WindowInsetsAnimation.Bounds bounds) {
        return i0.c.c(bounds.getLowerBound());
    }

    public static void g(FrameLayout frameLayout, hh.e eVar) {
        frameLayout.setWindowInsetsAnimationCallback(new r0(eVar));
    }

    @Override
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override
    public final void d(float f7) {
        this.e.setFraction(f7);
    }
}
