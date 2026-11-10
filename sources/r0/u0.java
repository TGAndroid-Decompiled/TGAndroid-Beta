package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f54238a;
    public float f54239b;
    public final Interpolator f54240c;
    public final long d;

    public u0(int i7, long j3, Interpolator interpolator) {
        this.f54238a = i7;
        this.f54240c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f54240c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f54239b);
        }
        return this.f54239b;
    }

    public int c() {
        return this.f54238a;
    }

    public void d(float f10) {
        this.f54239b = f10;
    }
}
