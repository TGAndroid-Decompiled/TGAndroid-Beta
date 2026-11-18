package wh;

import android.view.animation.Interpolator;
import c8.l9;
public final class e implements Interpolator {
    public final boolean f59887a;
    public final float f59888b;
    public final float f59889c;
    public final Interpolator d;

    public e(boolean z10, float f10, float f11, Interpolator interpolator) {
        this.f59887a = z10;
        this.f59888b = f10;
        this.f59889c = f11;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f10) {
        boolean z10 = this.f59887a;
        float f11 = this.f59888b;
        float f12 = this.f59889c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - l9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(l9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
