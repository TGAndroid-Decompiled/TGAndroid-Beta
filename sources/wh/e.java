package wh;

import android.view.animation.Interpolator;
import c8.l9;
public final class e implements Interpolator {
    public final boolean f59886a;
    public final float f59887b;
    public final float f59888c;
    public final Interpolator d;

    public e(boolean z10, float f10, float f11, Interpolator interpolator) {
        this.f59886a = z10;
        this.f59887b = f10;
        this.f59888c = f11;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f10) {
        boolean z10 = this.f59886a;
        float f11 = this.f59887b;
        float f12 = this.f59888c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - l9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(l9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
