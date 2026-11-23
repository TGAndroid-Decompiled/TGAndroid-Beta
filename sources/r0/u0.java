package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f56327a;
    public float f56328b;
    public final Interpolator f56329c;
    public final long d;

    public u0(int i7, long j3, Interpolator interpolator) {
        this.f56327a = i7;
        this.f56329c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f56329c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f56328b);
        }
        return this.f56328b;
    }

    public int c() {
        return this.f56327a;
    }

    public void d(float f10) {
        this.f56328b = f10;
    }
}
