package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f41871a;
    public float f41872b;
    public final Interpolator f41873c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f41871a = i10;
        this.f41873c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f41873c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f41872b);
        }
        return this.f41872b;
    }

    public int c() {
        return this.f41871a;
    }

    public void d(float f7) {
        this.f41872b = f7;
    }
}
