package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f54239a;
    public float f54240b;
    public final Interpolator f54241c;
    public final long d;

    public u0(int i7, long j3, Interpolator interpolator) {
        this.f54239a = i7;
        this.f54241c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f54241c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f54240b);
        }
        return this.f54240b;
    }

    public int c() {
        return this.f54239a;
    }

    public void d(float f10) {
        this.f54240b = f10;
    }
}
