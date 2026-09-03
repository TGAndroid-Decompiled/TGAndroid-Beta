package ph;

import android.animation.ValueAnimator;
public final class i2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41769a;
    public final k2 f41770b;

    public i2(k2 k2Var, int i10) {
        this.f41769a = i10;
        this.f41770b = k2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41769a) {
            case 0:
                this.f41770b.h.invalidate();
                return;
            default:
                this.f41770b.h.invalidate();
                return;
        }
    }
}
