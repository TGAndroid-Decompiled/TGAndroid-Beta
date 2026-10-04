package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f45633a;
    public float f45634b;
    public final Interpolator f45635c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f45633a = i10;
        this.f45635c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f45635c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f45634b);
        }
        return this.f45634b;
    }

    public int c() {
        return this.f45633a;
    }

    public void d(float f7) {
        this.f45634b = f7;
    }
}
