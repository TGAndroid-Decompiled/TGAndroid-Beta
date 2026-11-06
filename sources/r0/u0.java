package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f54133a;
    public float f54134b;
    public final Interpolator f54135c;
    public final long d;

    public u0(int i7, long j3, Interpolator interpolator) {
        this.f54133a = i7;
        this.f54135c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f54135c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f54134b);
        }
        return this.f54134b;
    }

    public int c() {
        return this.f54133a;
    }

    public void d(float f10) {
        this.f54134b = f10;
    }
}
