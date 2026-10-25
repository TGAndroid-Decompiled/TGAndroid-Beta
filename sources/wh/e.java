package wh;

import a8.ee;
import android.view.animation.Interpolator;
public final class e implements Interpolator {
    public final boolean f51223a;
    public final float f51224b;
    public final float f51225c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f51223a = z10;
        this.f51224b = f7;
        this.f51225c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f51223a;
        float f10 = this.f51224b;
        float f11 = this.f51225c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - ee.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(ee.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
