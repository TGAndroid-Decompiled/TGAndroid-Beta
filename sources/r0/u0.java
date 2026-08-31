package r0;

import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
public final class u0 extends v0 {
    public final WindowInsetsAnimation f46471e;

    public u0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, 0L, null);
        this.f46471e = windowInsetsAnimation;
    }

    public static i0.b e(WindowInsetsAnimation.Bounds bounds) {
        return i0.b.c(bounds.getUpperBound());
    }

    public static i0.b f(WindowInsetsAnimation.Bounds bounds) {
        return i0.b.c(bounds.getLowerBound());
    }

    public static void g(ViewGroup viewGroup, dh.e eVar) {
        viewGroup.setWindowInsetsAnimationCallback(new t0(eVar));
    }

    @Override
    public final long a() {
        return this.f46471e.getDurationMillis();
    }

    @Override
    public final float b() {
        return this.f46471e.getInterpolatedFraction();
    }

    @Override
    public final int c() {
        return this.f46471e.getTypeMask();
    }

    @Override
    public final void d(float f10) {
        this.f46471e.setFraction(f10);
    }
}
