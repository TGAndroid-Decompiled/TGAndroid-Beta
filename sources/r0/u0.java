package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f44735a;
    public float f44736b;
    public final Interpolator f44737c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f44735a = i10;
        this.f44737c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f44737c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f44736b);
        }
        return this.f44736b;
    }

    public int c() {
        return this.f44735a;
    }

    public void d(float f7) {
        this.f44736b = f7;
    }
}
