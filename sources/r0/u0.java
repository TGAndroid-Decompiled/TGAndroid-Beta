package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f46800a;
    public float f46801b;
    public final Interpolator f46802c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f46800a = i10;
        this.f46802c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f46802c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f46801b);
        }
        return this.f46801b;
    }

    public int c() {
        return this.f46800a;
    }

    public void d(float f7) {
        this.f46801b = f7;
    }
}
