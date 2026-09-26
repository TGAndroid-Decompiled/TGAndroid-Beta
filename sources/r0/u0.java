package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f42159a;
    public float f42160b;
    public final Interpolator f42161c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f42159a = i10;
        this.f42161c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f42161c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f42160b);
        }
        return this.f42160b;
    }

    public int c() {
        return this.f42159a;
    }

    public void d(float f7) {
        this.f42160b = f7;
    }
}
