package r0;

import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
public final class t0 extends u0 {
    public final WindowInsetsAnimation f45629e;

    public t0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, 0L, null);
        this.f45629e = windowInsetsAnimation;
    }

    public static i0.b e(WindowInsetsAnimation.Bounds bounds) {
        return i0.b.c(bounds.getUpperBound());
    }

    public static i0.b f(WindowInsetsAnimation.Bounds bounds) {
        return i0.b.c(bounds.getLowerBound());
    }

    public static void g(ViewGroup viewGroup, ph.e eVar) {
        viewGroup.setWindowInsetsAnimationCallback(new s0(eVar));
    }

    @Override
    public final long a() {
        return this.f45629e.getDurationMillis();
    }

    @Override
    public final float b() {
        return this.f45629e.getInterpolatedFraction();
    }

    @Override
    public final int c() {
        return this.f45629e.getTypeMask();
    }

    @Override
    public final void d(float f7) {
        this.f45629e.setFraction(f7);
    }
}
