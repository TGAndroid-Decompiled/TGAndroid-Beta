package th;

import android.view.animation.Interpolator;
import w7.q;
public final class f implements Interpolator {
    public final boolean f42201a;
    public final float f42202b;
    public final float f42203c;
    public final Interpolator d;

    public f(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f42201a = z10;
        this.f42202b = f7;
        this.f42203c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f42201a;
        float f10 = this.f42202b;
        float f11 = this.f42203c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - q.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(q.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
