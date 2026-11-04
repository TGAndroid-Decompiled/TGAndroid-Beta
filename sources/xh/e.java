package xh;

import android.view.animation.Interpolator;
import b8.be;
public final class e implements Interpolator {
    public final boolean f58821a;
    public final float f58822b;
    public final float f58823c;
    public final Interpolator d;

    public e(boolean z10, float f10, float f11, Interpolator interpolator) {
        this.f58821a = z10;
        this.f58822b = f10;
        this.f58823c = f11;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f10) {
        boolean z10 = this.f58821a;
        float f11 = this.f58822b;
        float f12 = this.f58823c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - be.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(be.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
