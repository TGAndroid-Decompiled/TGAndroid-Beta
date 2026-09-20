package uh;

import android.view.animation.Interpolator;
import w7.q;
public final class e implements Interpolator {
    public final boolean f44066a;
    public final float f44067b;
    public final float f44068c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f44066a = z10;
        this.f44067b = f7;
        this.f44068c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f44066a;
        float f10 = this.f44067b;
        float f11 = this.f44068c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - q.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(q.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
