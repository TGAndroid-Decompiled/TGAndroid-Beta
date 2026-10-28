package s4;

import android.animation.ValueAnimator;
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int f47770a;
    public final l f47771b;

    public e(l lVar, e1 e1Var, int i10) {
        this.f47770a = i10;
        this.f47771b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47770a) {
            case 0:
                this.f47771b.Q();
                return;
            default:
                this.f47771b.M();
                return;
        }
    }
}
