package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f44736a;
    public float f44737b;
    public final Interpolator f44738c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f44736a = i10;
        this.f44738c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f44738c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f44737b);
        }
        return this.f44737b;
    }

    public int c() {
        return this.f44736a;
    }

    public void d(float f7) {
        this.f44737b = f7;
    }
}
