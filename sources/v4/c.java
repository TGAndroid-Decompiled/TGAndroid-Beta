package v4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f57023a;
    public final k f57024b;

    public c(k kVar, d1 d1Var, int i7) {
        this.f57023a = i7;
        this.f57024b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f57023a) {
            case 0:
                this.f57024b.Q();
                return;
            default:
                this.f57024b.M();
                return;
        }
    }
}
