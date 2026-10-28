package wh;

import a8.ee;
import android.view.animation.Interpolator;
public final class e implements Interpolator {
    public final boolean f51284a;
    public final float f51285b;
    public final float f51286c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f51284a = z10;
        this.f51285b = f7;
        this.f51286c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f51284a;
        float f10 = this.f51285b;
        float f11 = this.f51286c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - ee.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(ee.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
