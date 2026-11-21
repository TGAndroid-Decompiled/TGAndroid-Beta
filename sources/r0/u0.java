package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f56323a;
    public float f56324b;
    public final Interpolator f56325c;
    public final long d;

    public u0(int i7, long j3, Interpolator interpolator) {
        this.f56323a = i7;
        this.f56325c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f56325c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f56324b);
        }
        return this.f56324b;
    }

    public int c() {
        return this.f56323a;
    }

    public void d(float f10) {
        this.f56324b = f10;
    }
}
