package r0;

import android.view.animation.Interpolator;
public abstract class v0 {
    public final int f46476a;
    public float f46477b;
    public final Interpolator f46478c;
    public final long d;

    public v0(int i10, long j10, Interpolator interpolator) {
        this.f46476a = i10;
        this.f46478c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f46478c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f46477b);
        }
        return this.f46477b;
    }

    public int c() {
        return this.f46476a;
    }

    public void d(float f10) {
        this.f46477b = f10;
    }
}
