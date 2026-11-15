package wh;

import android.view.animation.Interpolator;
import c8.i9;
public final class e implements Interpolator {
    public final boolean f59322a;
    public final float f59323b;
    public final float f59324c;
    public final Interpolator d;

    public e(boolean z10, float f10, float f11, Interpolator interpolator) {
        this.f59322a = z10;
        this.f59323b = f10;
        this.f59324c = f11;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f10) {
        boolean z10 = this.f59322a;
        float f11 = this.f59323b;
        float f12 = this.f59324c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - i9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(i9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
