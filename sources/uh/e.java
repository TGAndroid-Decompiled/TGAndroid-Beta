package uh;

import android.view.animation.Interpolator;
import w7.p;
public final class e implements Interpolator {
    public final boolean f43764a;
    public final float f43765b;
    public final float f43766c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f43764a = z10;
        this.f43765b = f7;
        this.f43766c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f43764a;
        float f10 = this.f43765b;
        float f11 = this.f43766c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - p.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(p.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
