package r0;

import android.view.animation.Interpolator;
public abstract class v0 {
    public final int f46953a;
    public float f46954b;
    public final Interpolator f46955c;
    public final long d;

    public v0(int i9, long j10, Interpolator interpolator) {
        this.f46953a = i9;
        this.f46955c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f46955c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f46954b);
        }
        return this.f46954b;
    }

    public int c() {
        return this.f46953a;
    }

    public void d(float f10) {
        this.f46954b = f10;
    }
}
