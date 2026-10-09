package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f46802a;
    public float f46803b;
    public final Interpolator f46804c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f46802a = i10;
        this.f46804c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f46804c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f46803b);
        }
        return this.f46803b;
    }

    public int c() {
        return this.f46802a;
    }

    public void d(float f7) {
        this.f46803b = f7;
    }
}
