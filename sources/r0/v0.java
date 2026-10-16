package r0;

import android.view.animation.Interpolator;
public abstract class v0 {
    public final int f43518a;
    public float f43519b;
    public final Interpolator f43520c;
    public final long d;

    public v0(int i10, long j10, Interpolator interpolator) {
        this.f43518a = i10;
        this.f43520c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f43520c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f43519b);
        }
        return this.f43519b;
    }

    public int c() {
        return this.f43518a;
    }

    public void d(float f7) {
        this.f43519b = f7;
    }
}
