package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f44763a;
    public float f44764b;
    public final Interpolator f44765c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f44763a = i10;
        this.f44765c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f44765c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f44764b);
        }
        return this.f44764b;
    }

    public int c() {
        return this.f44763a;
    }

    public void d(float f7) {
        this.f44764b = f7;
    }
}
