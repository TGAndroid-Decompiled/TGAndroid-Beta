package wh;

import a8.ee;
import android.view.animation.Interpolator;
public final class e implements Interpolator {
    public final boolean f51226a;
    public final float f51227b;
    public final float f51228c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f51226a = z10;
        this.f51227b = f7;
        this.f51228c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f51226a;
        float f10 = this.f51227b;
        float f11 = this.f51228c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - ee.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(ee.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
