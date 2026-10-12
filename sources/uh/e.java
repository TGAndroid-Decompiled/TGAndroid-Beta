package uh;

import android.view.animation.Interpolator;
import w7.n;
public final class e implements Interpolator {
    public final boolean f49200a;
    public final float f49201b;
    public final float f49202c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f49200a = z10;
        this.f49201b = f7;
        this.f49202c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f49200a;
        float f10 = this.f49201b;
        float f11 = this.f49202c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - n.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(n.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
