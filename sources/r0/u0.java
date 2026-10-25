package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f47136a;
    public float f47137b;
    public final Interpolator f47138c;
    public final long d;

    public u0(int i10, long j10, Interpolator interpolator) {
        this.f47136a = i10;
        this.f47138c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f47138c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f47137b);
        }
        return this.f47137b;
    }

    public int c() {
        return this.f47136a;
    }

    public void d(float f7) {
        this.f47137b = f7;
    }
}
