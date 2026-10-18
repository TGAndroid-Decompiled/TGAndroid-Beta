package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f44848a;
    public float f44849b;
    public final Interpolator f44850c;
    public final long d;

    public u0(int i10, long j10, Interpolator interpolator) {
        this.f44848a = i10;
        this.f44850c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f44850c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f44849b);
        }
        return this.f44849b;
    }

    public int c() {
        return this.f44848a;
    }

    public void d(float f7) {
        this.f44849b = f7;
    }
}
