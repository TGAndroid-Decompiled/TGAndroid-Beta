package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f42265a;
    public float f42266b;
    public final Interpolator f42267c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f42265a = i10;
        this.f42267c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f42267c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f42266b);
        }
        return this.f42266b;
    }

    public int c() {
        return this.f42265a;
    }

    public void d(float f7) {
        this.f42266b = f7;
    }
}
