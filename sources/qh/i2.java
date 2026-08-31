package qh;

import android.animation.ValueAnimator;
public final class i2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45407a;
    public final k2 f45408b;

    public i2(k2 k2Var, int i10) {
        this.f45407a = i10;
        this.f45408b = k2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45407a) {
            case 0:
                this.f45408b.h.invalidate();
                return;
            default:
                this.f45408b.h.invalidate();
                return;
        }
    }
}
