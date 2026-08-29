package r0;

import android.view.animation.Interpolator;
public abstract class v0 {
    public final int f46867a;
    public float f46868b;
    public final Interpolator f46869c;
    public final long d;

    public v0(int i10, long j10, Interpolator interpolator) {
        this.f46867a = i10;
        this.f46869c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f46869c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f46868b);
        }
        return this.f46868b;
    }

    public int c() {
        return this.f46867a;
    }

    public void d(float f9) {
        this.f46868b = f9;
    }
}
