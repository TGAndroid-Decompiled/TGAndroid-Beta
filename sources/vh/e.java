package vh;

import android.view.animation.Interpolator;
import w7.r;
public final class e implements Interpolator {
    public final boolean f48402a;
    public final float f48403b;
    public final float f48404c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f48402a = z10;
        this.f48403b = f7;
        this.f48404c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f48402a;
        float f10 = this.f48403b;
        float f11 = this.f48404c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - r.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(r.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
