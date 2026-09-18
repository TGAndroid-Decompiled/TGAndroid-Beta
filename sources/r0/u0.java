package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f41902a;
    public float f41903b;
    public final Interpolator f41904c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f41902a = i10;
        this.f41904c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f41904c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f41903b);
        }
        return this.f41903b;
    }

    public int c() {
        return this.f41902a;
    }

    public void d(float f7) {
        this.f41903b = f7;
    }
}
