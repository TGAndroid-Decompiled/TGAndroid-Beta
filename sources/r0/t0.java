package r0;

import android.view.animation.Interpolator;
public abstract class t0 {
    public final int f46164a;
    public float f46165b;
    public final Interpolator f46166c;
    public final long d;

    public t0(int i10, long j10, Interpolator interpolator) {
        this.f46164a = i10;
        this.f46166c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f46166c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f46165b);
        }
        return this.f46165b;
    }

    public int c() {
        return this.f46164a;
    }

    public void d(float f7) {
        this.f46165b = f7;
    }
}
