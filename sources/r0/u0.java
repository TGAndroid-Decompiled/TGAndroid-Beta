package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f56292a;
    public float f56293b;
    public final Interpolator f56294c;
    public final long d;

    public u0(int i7, long j3, Interpolator interpolator) {
        this.f56292a = i7;
        this.f56294c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f56294c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f56293b);
        }
        return this.f56293b;
    }

    public int c() {
        return this.f56292a;
    }

    public void d(float f10) {
        this.f56293b = f10;
    }
}
