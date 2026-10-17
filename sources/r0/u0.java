package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f44874a;
    public float f44875b;
    public final Interpolator f44876c;
    public final long d;

    public u0(int i10, long j10, Interpolator interpolator) {
        this.f44874a = i10;
        this.f44876c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f44876c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f44875b);
        }
        return this.f44875b;
    }

    public int c() {
        return this.f44874a;
    }

    public void d(float f7) {
        this.f44875b = f7;
    }
}
