package s4;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f46371a;
    public final k f46372b;

    public d(k kVar, b1 b1Var, int i10) {
        this.f46371a = i10;
        this.f46372b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46371a) {
            case 0:
                this.f46372b.Q();
                return;
            default:
                this.f46372b.M();
                return;
        }
    }
}
