package s4;

import android.animation.ValueAnimator;
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int f47735a;
    public final l f47736b;

    public e(l lVar, e1 e1Var, int i10) {
        this.f47735a = i10;
        this.f47736b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47735a) {
            case 0:
                this.f47736b.Q();
                return;
            default:
                this.f47736b.M();
                return;
        }
    }
}
