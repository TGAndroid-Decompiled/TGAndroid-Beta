package wh;

import android.view.animation.Interpolator;
import c8.m9;
public final class e implements Interpolator {
    public final boolean f59897a;
    public final float f59898b;
    public final float f59899c;
    public final Interpolator d;

    public e(boolean z10, float f10, float f11, Interpolator interpolator) {
        this.f59897a = z10;
        this.f59898b = f10;
        this.f59899c = f11;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f10) {
        boolean z10 = this.f59897a;
        float f11 = this.f59898b;
        float f12 = this.f59899c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - m9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(m9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
