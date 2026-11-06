package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f54134a;
    public float f54135b;
    public final Interpolator f54136c;
    public final long d;

    public u0(int i7, long j3, Interpolator interpolator) {
        this.f54134a = i7;
        this.f54136c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f54136c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f54135b);
        }
        return this.f54135b;
    }

    public int c() {
        return this.f54134a;
    }

    public void d(float f10) {
        this.f54135b = f10;
    }
}
