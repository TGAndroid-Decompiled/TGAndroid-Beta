package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f45634a;
    public float f45635b;
    public final Interpolator f45636c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f45634a = i10;
        this.f45636c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f45636c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f45635b);
        }
        return this.f45635b;
    }

    public int c() {
        return this.f45634a;
    }

    public void d(float f7) {
        this.f45635b = f7;
    }
}
