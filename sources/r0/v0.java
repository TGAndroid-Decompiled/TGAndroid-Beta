package r0;

import android.view.animation.Interpolator;
public abstract class v0 {
    public final int f42130a;
    public float f42131b;
    public final Interpolator f42132c;
    public final long d;

    public v0(int i10, long j3, Interpolator interpolator) {
        this.f42130a = i10;
        this.f42132c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f42132c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f42131b);
        }
        return this.f42131b;
    }

    public int c() {
        return this.f42130a;
    }

    public void d(float f7) {
        this.f42131b = f7;
    }
}
