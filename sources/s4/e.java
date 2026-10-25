package s4;

import android.animation.ValueAnimator;
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int f47732a;
    public final l f47733b;

    public e(l lVar, e1 e1Var, int i10) {
        this.f47732a = i10;
        this.f47733b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47732a) {
            case 0:
                this.f47733b.Q();
                return;
            default:
                this.f47733b.M();
                return;
        }
    }
}
