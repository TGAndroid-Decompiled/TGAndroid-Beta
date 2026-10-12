package uh;

import android.view.animation.Interpolator;
import w7.n;
public final class e implements Interpolator {
    public final boolean f49208a;
    public final float f49209b;
    public final float f49210c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f49208a = z10;
        this.f49209b = f7;
        this.f49210c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f49208a;
        float f10 = this.f49209b;
        float f11 = this.f49210c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - n.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(n.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
