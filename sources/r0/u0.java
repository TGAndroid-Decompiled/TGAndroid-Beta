package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f45272a;
    public float f45273b;
    public final Interpolator f45274c;
    public final long d;

    public u0(int i10, long j10, Interpolator interpolator) {
        this.f45272a = i10;
        this.f45274c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f45274c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f45273b);
        }
        return this.f45273b;
    }

    public int c() {
        return this.f45272a;
    }

    public void d(float f7) {
        this.f45273b = f7;
    }
}
