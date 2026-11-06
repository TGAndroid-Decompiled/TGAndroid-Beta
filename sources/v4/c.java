package v4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f56907a;
    public final k f56908b;

    public c(k kVar, d1 d1Var, int i7) {
        this.f56907a = i7;
        this.f56908b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56907a) {
            case 0:
                this.f56908b.Q();
                return;
            default:
                this.f56908b.M();
                return;
        }
    }
}
