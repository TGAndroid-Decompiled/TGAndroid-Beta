package wh;

import android.view.animation.Interpolator;
import c8.m9;
public final class e implements Interpolator {
    public final boolean f60015a;
    public final float f60016b;
    public final float f60017c;
    public final Interpolator d;

    public e(boolean z10, float f10, float f11, Interpolator interpolator) {
        this.f60015a = z10;
        this.f60016b = f10;
        this.f60017c = f11;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f10) {
        boolean z10 = this.f60015a;
        float f11 = this.f60016b;
        float f12 = this.f60017c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - m9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(m9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
