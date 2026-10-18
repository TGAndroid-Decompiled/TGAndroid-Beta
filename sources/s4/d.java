package s4;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f45987a;
    public final k f45988b;

    public d(k kVar, b1 b1Var, int i10) {
        this.f45987a = i10;
        this.f45988b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45987a) {
            case 0:
                this.f45988b.Q();
                return;
            default:
                this.f45988b.M();
                return;
        }
    }
}
