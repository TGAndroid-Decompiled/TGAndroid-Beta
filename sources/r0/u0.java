package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f42205a;
    public float f42206b;
    public final Interpolator f42207c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f42205a = i10;
        this.f42207c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f42207c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f42206b);
        }
        return this.f42206b;
    }

    public int c() {
        return this.f42205a;
    }

    public void d(float f7) {
        this.f42206b = f7;
    }
}
