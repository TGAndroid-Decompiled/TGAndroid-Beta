package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f46846a;
    public float f46847b;
    public final Interpolator f46848c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f46846a = i10;
        this.f46848c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f46848c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f46847b);
        }
        return this.f46847b;
    }

    public int c() {
        return this.f46846a;
    }

    public void d(float f7) {
        this.f46847b = f7;
    }
}
