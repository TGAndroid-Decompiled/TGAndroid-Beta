package v4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f57024a;
    public final k f57025b;

    public c(k kVar, d1 d1Var, int i7) {
        this.f57024a = i7;
        this.f57025b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f57024a) {
            case 0:
                this.f57025b.Q();
                return;
            default:
                this.f57025b.M();
                return;
        }
    }
}
