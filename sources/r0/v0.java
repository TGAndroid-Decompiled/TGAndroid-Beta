package r0;

import android.view.animation.Interpolator;
public abstract class v0 {
    public final int f43762a;
    public float f43763b;
    public final Interpolator f43764c;
    public final long d;

    public v0(int i10, long j10, Interpolator interpolator) {
        this.f43762a = i10;
        this.f43764c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f43764c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f43763b);
        }
        return this.f43763b;
    }

    public int c() {
        return this.f43762a;
    }

    public void d(float f7) {
        this.f43763b = f7;
    }
}
