package r0;

import android.view.animation.Interpolator;
public abstract class v0 {
    public final int f43174a;
    public float f43175b;
    public final Interpolator f43176c;
    public final long d;

    public v0(int i10, long j10, Interpolator interpolator) {
        this.f43174a = i10;
        this.f43176c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f43176c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f43175b);
        }
        return this.f43175b;
    }

    public int c() {
        return this.f43174a;
    }

    public void d(float f10) {
        this.f43175b = f10;
    }
}
