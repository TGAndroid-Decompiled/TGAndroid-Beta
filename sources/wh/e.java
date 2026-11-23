package wh;

import android.view.animation.Interpolator;
import c8.l9;
public final class e implements Interpolator {
    public final boolean f59932a;
    public final float f59933b;
    public final float f59934c;
    public final Interpolator d;

    public e(boolean z10, float f10, float f11, Interpolator interpolator) {
        this.f59932a = z10;
        this.f59933b = f10;
        this.f59934c = f11;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f10) {
        boolean z10 = this.f59932a;
        float f11 = this.f59933b;
        float f12 = this.f59934c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - l9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(l9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
