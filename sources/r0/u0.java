package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f41827a;
    public float f41828b;
    public final Interpolator f41829c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f41827a = i10;
        this.f41829c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f41829c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f41828b);
        }
        return this.f41828b;
    }

    public int c() {
        return this.f41827a;
    }

    public void d(float f7) {
        this.f41828b = f7;
    }
}
