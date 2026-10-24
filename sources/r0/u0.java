package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f45271a;
    public float f45272b;
    public final Interpolator f45273c;
    public final long d;

    public u0(int i10, long j10, Interpolator interpolator) {
        this.f45271a = i10;
        this.f45273c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f45273c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f45272b);
        }
        return this.f45272b;
    }

    public int c() {
        return this.f45271a;
    }

    public void d(float f7) {
        this.f45272b = f7;
    }
}
