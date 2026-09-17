package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f44764a;
    public float f44765b;
    public final Interpolator f44766c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f44764a = i10;
        this.f44766c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f44766c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f44765b);
        }
        return this.f44765b;
    }

    public int c() {
        return this.f44764a;
    }

    public void d(float f7) {
        this.f44765b = f7;
    }
}
