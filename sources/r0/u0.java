package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f46892a;
    public float f46893b;
    public final Interpolator f46894c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f46892a = i10;
        this.f46894c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f46894c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f46893b);
        }
        return this.f46893b;
    }

    public int c() {
        return this.f46892a;
    }

    public void d(float f7) {
        this.f46893b = f7;
    }
}
