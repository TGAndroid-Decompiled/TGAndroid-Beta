package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f42160a;
    public float f42161b;
    public final Interpolator f42162c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f42160a = i10;
        this.f42162c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f42162c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f42161b);
        }
        return this.f42161b;
    }

    public int c() {
        return this.f42160a;
    }

    public void d(float f7) {
        this.f42161b = f7;
    }
}
