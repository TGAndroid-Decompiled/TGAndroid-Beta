package r0;

import android.view.WindowInsetsAnimation;
import android.widget.FrameLayout;
public final class t0 extends u0 {
    public final WindowInsetsAnimation f55706e;

    public t0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, 0L, null);
        this.f55706e = windowInsetsAnimation;
    }

    public static i0.c e(WindowInsetsAnimation.Bounds bounds) {
        return i0.c.c(bounds.getUpperBound());
    }

    public static i0.c f(WindowInsetsAnimation.Bounds bounds) {
        return i0.c.c(bounds.getLowerBound());
    }

    public static void g(FrameLayout frameLayout, rh.d dVar) {
        frameLayout.setWindowInsetsAnimationCallback(new s0(dVar));
    }

    @Override
    public final long a() {
        return this.f55706e.getDurationMillis();
    }

    @Override
    public final float b() {
        return this.f55706e.getInterpolatedFraction();
    }

    @Override
    public final int c() {
        return this.f55706e.getTypeMask();
    }

    @Override
    public final void d(float f10) {
        this.f55706e.setFraction(f10);
    }
}
