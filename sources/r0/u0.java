package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f42161a;
    public float f42162b;
    public final Interpolator f42163c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f42161a = i10;
        this.f42163c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f42163c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f42162b);
        }
        return this.f42162b;
    }

    public int c() {
        return this.f42161a;
    }

    public void d(float f7) {
        this.f42162b = f7;
    }
}
