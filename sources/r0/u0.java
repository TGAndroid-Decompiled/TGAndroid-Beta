package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f47025a;
    public float f47026b;
    public final Interpolator f47027c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f47025a = i10;
        this.f47027c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f47027c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f47026b);
        }
        return this.f47026b;
    }

    public int c() {
        return this.f47025a;
    }

    public void d(float f7) {
        this.f47026b = f7;
    }
}
