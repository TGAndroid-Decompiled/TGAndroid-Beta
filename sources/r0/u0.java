package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f42195a;
    public float f42196b;
    public final Interpolator f42197c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f42195a = i10;
        this.f42197c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f42197c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f42196b);
        }
        return this.f42196b;
    }

    public int c() {
        return this.f42195a;
    }

    public void d(float f7) {
        this.f42196b = f7;
    }
}
