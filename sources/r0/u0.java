package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f41875a;
    public float f41876b;
    public final Interpolator f41877c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f41875a = i10;
        this.f41877c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f41877c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f41876b);
        }
        return this.f41876b;
    }

    public int c() {
        return this.f41875a;
    }

    public void d(float f7) {
        this.f41876b = f7;
    }
}
