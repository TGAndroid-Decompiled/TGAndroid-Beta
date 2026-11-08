package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f54226a;
    public float f54227b;
    public final Interpolator f54228c;
    public final long d;

    public u0(int i7, long j3, Interpolator interpolator) {
        this.f54226a = i7;
        this.f54228c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f54228c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f54227b);
        }
        return this.f54227b;
    }

    public int c() {
        return this.f54226a;
    }

    public void d(float f10) {
        this.f54227b = f10;
    }
}
