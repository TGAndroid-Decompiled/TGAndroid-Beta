package v4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f56932a;
    public final k f56933b;

    public c(k kVar, d1 d1Var, int i7) {
        this.f56932a = i7;
        this.f56933b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56932a) {
            case 0:
                this.f56933b.Q();
                return;
            default:
                this.f56933b.M();
                return;
        }
    }
}
