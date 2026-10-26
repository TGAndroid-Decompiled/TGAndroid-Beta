package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f47139a;
    public float f47140b;
    public final Interpolator f47141c;
    public final long d;

    public u0(int i10, long j10, Interpolator interpolator) {
        this.f47139a = i10;
        this.f47141c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f47141c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f47140b);
        }
        return this.f47140b;
    }

    public int c() {
        return this.f47139a;
    }

    public void d(float f7) {
        this.f47140b = f7;
    }
}
