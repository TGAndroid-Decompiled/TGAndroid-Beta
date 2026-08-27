package r0;

import android.view.animation.Interpolator;

public abstract class v0 {

    public final int f46643a;

    public float f46644b;

    public final Interpolator f46645c;
    public final long d;

    public v0(int i10, long j10, Interpolator interpolator) {
        this.f46643a = i10;
        this.f46645c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f46645c;
        return interpolator != null ? interpolator.getInterpolation(this.f46644b) : this.f46644b;
    }

    public int c() {
        return this.f46643a;
    }

    public void d(float f10) {
        this.f46644b = f10;
    }
}
