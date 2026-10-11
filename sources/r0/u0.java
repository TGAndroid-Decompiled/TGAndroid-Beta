package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f46926a;
    public float f46927b;
    public final Interpolator f46928c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f46926a = i10;
        this.f46928c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f46928c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f46927b);
        }
        return this.f46927b;
    }

    public int c() {
        return this.f46926a;
    }

    public void d(float f7) {
        this.f46927b = f7;
    }
}
