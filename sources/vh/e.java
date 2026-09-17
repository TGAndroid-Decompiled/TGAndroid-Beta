package vh;

import android.view.animation.Interpolator;
import w7.p;
public final class e implements Interpolator {
    public final boolean f47883a;
    public final float f47884b;
    public final float f47885c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f47883a = z10;
        this.f47884b = f7;
        this.f47885c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f47883a;
        float f10 = this.f47884b;
        float f11 = this.f47885c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - p.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(p.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
