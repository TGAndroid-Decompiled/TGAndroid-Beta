package r0;

import android.view.animation.Interpolator;
public abstract class v0 {
    public final int f46507a;
    public float f46508b;
    public final Interpolator f46509c;
    public final long d;

    public v0(int i10, long j10, Interpolator interpolator) {
        this.f46507a = i10;
        this.f46509c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f46509c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f46508b);
        }
        return this.f46508b;
    }

    public int c() {
        return this.f46507a;
    }

    public void d(float f10) {
        this.f46508b = f10;
    }
}
