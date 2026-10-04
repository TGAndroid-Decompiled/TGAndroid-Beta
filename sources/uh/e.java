package uh;

import android.view.animation.Interpolator;
import w7.q;
public final class e implements Interpolator {
    public final boolean f47699a;
    public final float f47700b;
    public final float f47701c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f47699a = z10;
        this.f47700b = f7;
        this.f47701c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f47699a;
        float f10 = this.f47700b;
        float f11 = this.f47701c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - q.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(q.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
