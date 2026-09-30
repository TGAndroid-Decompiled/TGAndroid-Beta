package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f42162a;
    public float f42163b;
    public final Interpolator f42164c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f42162a = i10;
        this.f42164c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f42164c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f42163b);
        }
        return this.f42163b;
    }

    public int c() {
        return this.f42162a;
    }

    public void d(float f7) {
        this.f42163b = f7;
    }
}
