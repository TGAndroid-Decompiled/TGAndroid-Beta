package v4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f56931a;
    public final k f56932b;

    public c(k kVar, d1 d1Var, int i7) {
        this.f56931a = i7;
        this.f56932b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56931a) {
            case 0:
                this.f56932b.Q();
                return;
            default:
                this.f56932b.M();
                return;
        }
    }
}
