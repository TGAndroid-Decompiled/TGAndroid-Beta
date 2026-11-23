package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f56405a;
    public float f56406b;
    public final Interpolator f56407c;
    public final long d;

    public u0(int i7, long j3, Interpolator interpolator) {
        this.f56405a = i7;
        this.f56407c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f56407c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f56406b);
        }
        return this.f56406b;
    }

    public int c() {
        return this.f56405a;
    }

    public void d(float f10) {
        this.f56406b = f10;
    }
}
