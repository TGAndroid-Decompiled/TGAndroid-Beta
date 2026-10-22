package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f44859a;
    public float f44860b;
    public final Interpolator f44861c;
    public final long d;

    public u0(int i10, long j10, Interpolator interpolator) {
        this.f44859a = i10;
        this.f44861c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f44861c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f44860b);
        }
        return this.f44860b;
    }

    public int c() {
        return this.f44859a;
    }

    public void d(float f7) {
        this.f44860b = f7;
    }
}
