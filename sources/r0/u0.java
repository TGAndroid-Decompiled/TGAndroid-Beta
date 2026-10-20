package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f44856a;
    public float f44857b;
    public final Interpolator f44858c;
    public final long d;

    public u0(int i10, long j10, Interpolator interpolator) {
        this.f44856a = i10;
        this.f44858c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f44858c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f44857b);
        }
        return this.f44857b;
    }

    public int c() {
        return this.f44856a;
    }

    public void d(float f7) {
        this.f44857b = f7;
    }
}
