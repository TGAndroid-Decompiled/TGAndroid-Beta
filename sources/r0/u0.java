package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f44894a;
    public float f44895b;
    public final Interpolator f44896c;
    public final long d;

    public u0(int i10, long j10, Interpolator interpolator) {
        this.f44894a = i10;
        this.f44896c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f44896c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f44895b);
        }
        return this.f44895b;
    }

    public int c() {
        return this.f44894a;
    }

    public void d(float f7) {
        this.f44895b = f7;
    }
}
