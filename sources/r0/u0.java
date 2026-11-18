package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f56282a;
    public float f56283b;
    public final Interpolator f56284c;
    public final long d;

    public u0(int i7, long j3, Interpolator interpolator) {
        this.f56282a = i7;
        this.f56284c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f56284c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f56283b);
        }
        return this.f56283b;
    }

    public int c() {
        return this.f56282a;
    }

    public void d(float f10) {
        this.f56283b = f10;
    }
}
