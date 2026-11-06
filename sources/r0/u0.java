package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f54109a;
    public float f54110b;
    public final Interpolator f54111c;
    public final long d;

    public u0(int i7, long j3, Interpolator interpolator) {
        this.f54109a = i7;
        this.f54111c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f54111c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f54110b);
        }
        return this.f54110b;
    }

    public int c() {
        return this.f54109a;
    }

    public void d(float f10) {
        this.f54110b = f10;
    }
}
