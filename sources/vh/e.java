package vh;

import android.view.animation.Interpolator;
import w7.s;
public final class e implements Interpolator {
    public final boolean f47017a;
    public final float f47018b;
    public final float f47019c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f47017a = z10;
        this.f47018b = f7;
        this.f47019c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f47017a;
        float f10 = this.f47018b;
        float f11 = this.f47019c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - s.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(s.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
