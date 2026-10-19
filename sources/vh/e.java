package vh;

import android.view.animation.Interpolator;
import w7.r;
public final class e implements Interpolator {
    public final boolean f48404a;
    public final float f48405b;
    public final float f48406c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f48404a = z10;
        this.f48405b = f7;
        this.f48406c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f48404a;
        float f10 = this.f48405b;
        float f11 = this.f48406c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - r.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(r.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
