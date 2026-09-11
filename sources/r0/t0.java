package r0;

import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
public final class t0 extends u0 {
    public final WindowInsetsAnimation f44730e;

    public t0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, 0L, null);
        this.f44730e = windowInsetsAnimation;
    }

    public static i0.c e(WindowInsetsAnimation.Bounds bounds) {
        return i0.c.c(bounds.getUpperBound());
    }

    public static i0.c f(WindowInsetsAnimation.Bounds bounds) {
        return i0.c.c(bounds.getLowerBound());
    }

    public static void g(ViewGroup viewGroup, qh.e eVar) {
        viewGroup.setWindowInsetsAnimationCallback(new s0(eVar));
    }

    @Override
    public final long a() {
        return this.f44730e.getDurationMillis();
    }

    @Override
    public final float b() {
        return this.f44730e.getInterpolatedFraction();
    }

    @Override
    public final int c() {
        return this.f44730e.getTypeMask();
    }

    @Override
    public final void d(float f7) {
        this.f44730e.setFraction(f7);
    }
}
