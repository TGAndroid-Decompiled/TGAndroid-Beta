package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f45648a;
    public float f45649b;
    public final Interpolator f45650c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f45648a = i10;
        this.f45650c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f45650c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f45649b);
        }
        return this.f45649b;
    }

    public int c() {
        return this.f45648a;
    }

    public void d(float f7) {
        this.f45649b = f7;
    }
}
