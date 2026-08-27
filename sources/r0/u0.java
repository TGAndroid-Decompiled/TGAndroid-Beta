package r0;

import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;

public final class u0 extends v0 {

    public final WindowInsetsAnimation f46638e;

    public u0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, 0L, null);
        this.f46638e = windowInsetsAnimation;
    }

    public static i0.c e(WindowInsetsAnimation.Bounds bounds) {
        return i0.c.c(bounds.getUpperBound());
    }

    public static i0.c f(WindowInsetsAnimation.Bounds bounds) {
        return i0.c.c(bounds.getLowerBound());
    }

    public static void g(ViewGroup viewGroup, yg.e eVar) {
        viewGroup.setWindowInsetsAnimationCallback(new t0(eVar));
    }

    @Override
    public final long a() {
        return this.f46638e.getDurationMillis();
    }

    @Override
    public final float b() {
        return this.f46638e.getInterpolatedFraction();
    }

    @Override
    public final int c() {
        return this.f46638e.getTypeMask();
    }

    @Override
    public final void d(float f10) {
        this.f46638e.setFraction(f10);
    }
}
