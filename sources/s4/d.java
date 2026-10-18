package s4;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f45939a;
    public final k f45940b;

    public d(k kVar, b1 b1Var, int i10) {
        this.f45939a = i10;
        this.f45940b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45939a) {
            case 0:
                this.f45940b.Q();
                return;
            default:
                this.f45940b.M();
                return;
        }
    }
}
