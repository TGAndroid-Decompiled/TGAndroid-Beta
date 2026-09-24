package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f42146a;
    public float f42147b;
    public final Interpolator f42148c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f42146a = i10;
        this.f42148c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f42148c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f42147b);
        }
        return this.f42147b;
    }

    public int c() {
        return this.f42146a;
    }

    public void d(float f7) {
        this.f42147b = f7;
    }
}
