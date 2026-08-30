package r0;

import android.view.animation.Interpolator;
public abstract class v0 {
    public final int f43150a;
    public float f43151b;
    public final Interpolator f43152c;
    public final long d;

    public v0(int i10, long j10, Interpolator interpolator) {
        this.f43150a = i10;
        this.f43152c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f43152c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f43151b);
        }
        return this.f43151b;
    }

    public int c() {
        return this.f43150a;
    }

    public void d(float f10) {
        this.f43151b = f10;
    }
}
