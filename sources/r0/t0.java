package r0;

import android.view.WindowInsetsAnimation;
import android.widget.FrameLayout;
public final class t0 extends u0 {
    public final WindowInsetsAnimation f54226e;

    public t0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, 0L, null);
        this.f54226e = windowInsetsAnimation;
    }

    public static i0.b e(WindowInsetsAnimation.Bounds bounds) {
        return i0.b.c(bounds.getUpperBound());
    }

    public static i0.b f(WindowInsetsAnimation.Bounds bounds) {
        return i0.b.c(bounds.getLowerBound());
    }

    public static void g(FrameLayout frameLayout, rh.d dVar) {
        frameLayout.setWindowInsetsAnimationCallback(new s0(dVar));
    }

    @Override
    public final long a() {
        return this.f54226e.getDurationMillis();
    }

    @Override
    public final float b() {
        return this.f54226e.getInterpolatedFraction();
    }

    @Override
    public final int c() {
        return this.f54226e.getTypeMask();
    }

    @Override
    public final void d(float f10) {
        this.f54226e.setFraction(f10);
    }
}
