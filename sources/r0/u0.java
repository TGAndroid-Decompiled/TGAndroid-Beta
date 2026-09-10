package r0;

import android.view.animation.Interpolator;
public abstract class u0 {
    public final int f41094a;
    public float f41095b;
    public final Interpolator f41096c;
    public final long d;

    public u0(int i10, long j3, Interpolator interpolator) {
        this.f41094a = i10;
        this.f41096c = interpolator;
        this.d = j3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f41096c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f41095b);
        }
        return this.f41095b;
    }

    public int c() {
        return this.f41094a;
    }

    public void d(float f7) {
        this.f41095b = f7;
    }
}
