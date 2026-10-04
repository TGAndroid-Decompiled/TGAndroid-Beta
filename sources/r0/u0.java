package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f45641a;
    public float f45642b;
    public final Interpolator f45643c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f45641a = i10;
        this.f45643c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f45643c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f45642b);
        }
        return this.f45642b;
    }

    public int c() {
        return this.f45641a;
    }

    public void d(float f7) {
        this.f45642b = f7;
    }
}
