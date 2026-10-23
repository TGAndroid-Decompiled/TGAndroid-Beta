package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f44860a;
    public float f44861b;
    public final Interpolator f44862c;
    public final long d;

    public u0(int i10, long j10, Interpolator interpolator) {
        this.f44860a = i10;
        this.f44862c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f44862c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f44861b);
        }
        return this.f44861b;
    }

    public int c() {
        return this.f44860a;
    }

    public void d(float f7) {
        this.f44861b = f7;
    }
}
