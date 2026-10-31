package r0;

import android.view.animation.Interpolator;
public abstract class t0 {
    public final int f46153a;
    public float f46154b;
    public final Interpolator f46155c;
    public final long d;

    public t0(int i10, long j10, Interpolator interpolator) {
        this.f46153a = i10;
        this.f46155c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f46155c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f46154b);
        }
        return this.f46154b;
    }

    public int c() {
        return this.f46153a;
    }

    public void d(float f7) {
        this.f46154b = f7;
    }
}
