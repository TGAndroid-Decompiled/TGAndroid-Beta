package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f54051a;
    public float f54052b;
    public final Interpolator f54053c;
    public final long d;

    public u0(int i3, long j10, Interpolator interpolator) {
        this.f54051a = i3;
        this.f54053c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f54053c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f54052b);
        }
        return this.f54052b;
    }

    public int c() {
        return this.f54051a;
    }

    public void d(float f10) {
        this.f54052b = f10;
    }
}
