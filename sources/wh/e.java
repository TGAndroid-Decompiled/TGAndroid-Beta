package wh;

import android.view.animation.Interpolator;
import c8.j9;
public final class e implements Interpolator {
    public final boolean f57882a;
    public final float f57883b;
    public final float f57884c;
    public final Interpolator d;

    public e(boolean z9, float f10, float f11, Interpolator interpolator) {
        this.f57882a = z9;
        this.f57883b = f10;
        this.f57884c = f11;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f10) {
        boolean z9 = this.f57882a;
        float f11 = this.f57883b;
        float f12 = this.f57884c;
        Interpolator interpolator = this.d;
        if (z9) {
            return 1.0f - interpolator.getInterpolation(1.0f - j9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(j9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
