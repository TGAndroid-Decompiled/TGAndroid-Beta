package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f42174a;
    public float f42175b;
    public final Interpolator f42176c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f42174a = i10;
        this.f42176c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f42176c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f42175b);
        }
        return this.f42175b;
    }

    public int c() {
        return this.f42174a;
    }

    public void d(float f7) {
        this.f42175b = f7;
    }
}
