package ph;

import android.animation.ValueAnimator;
public final class i2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41738a;
    public final k2 f41739b;

    public i2(k2 k2Var, int i10) {
        this.f41738a = i10;
        this.f41739b = k2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41738a) {
            case 0:
                this.f41739b.h.invalidate();
                return;
            default:
                this.f41739b.h.invalidate();
                return;
        }
    }
}
