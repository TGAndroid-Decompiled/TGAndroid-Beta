package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f44846a;
    public float f44847b;
    public final Interpolator f44848c;
    public final long d;

    public u0(int i10, long j10, Interpolator interpolator) {
        this.f44846a = i10;
        this.f44848c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f44848c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f44847b);
        }
        return this.f44847b;
    }

    public int c() {
        return this.f44846a;
    }

    public void d(float f7) {
        this.f44847b = f7;
    }
}
