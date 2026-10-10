package uh;

import android.view.animation.Interpolator;
import w7.o;
public final class e implements Interpolator {
    public final boolean f49016a;
    public final float f49017b;
    public final float f49018c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f49016a = z10;
        this.f49017b = f7;
        this.f49018c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f49016a;
        float f10 = this.f49017b;
        float f11 = this.f49018c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - o.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(o.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
