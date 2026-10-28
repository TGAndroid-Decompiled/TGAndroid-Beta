package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f47174a;
    public float f47175b;
    public final Interpolator f47176c;
    public final long d;

    public u0(int i10, long j10, Interpolator interpolator) {
        this.f47174a = i10;
        this.f47176c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f47176c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f47175b);
        }
        return this.f47175b;
    }

    public int c() {
        return this.f47174a;
    }

    public void d(float f7) {
        this.f47175b = f7;
    }
}
