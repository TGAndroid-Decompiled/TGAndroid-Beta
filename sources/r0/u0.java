package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f55707a;
    public float f55708b;
    public final Interpolator f55709c;
    public final long d;

    public u0(int i7, long j3, Interpolator interpolator) {
        this.f55707a = i7;
        this.f55709c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f55709c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f55708b);
        }
        return this.f55708b;
    }

    public int c() {
        return this.f55707a;
    }

    public void d(float f10) {
        this.f55708b = f10;
    }
}
