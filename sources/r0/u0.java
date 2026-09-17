package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f41897a;
    public float f41898b;
    public final Interpolator f41899c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f41897a = i10;
        this.f41899c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f41899c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f41898b);
        }
        return this.f41898b;
    }

    public int c() {
        return this.f41897a;
    }

    public void d(float f7) {
        this.f41898b = f7;
    }
}
