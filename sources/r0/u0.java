package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f47017a;
    public float f47018b;
    public final Interpolator f47019c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f47017a = i10;
        this.f47019c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f47019c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f47018b);
        }
        return this.f47018b;
    }

    public int c() {
        return this.f47017a;
    }

    public void d(float f7) {
        this.f47018b = f7;
    }
}
