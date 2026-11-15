package v4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f58512a;
    public final k f58513b;

    public c(k kVar, e1 e1Var, int i7) {
        this.f58512a = i7;
        this.f58513b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58512a) {
            case 0:
                this.f58513b.Q();
                return;
            default:
                this.f58513b.M();
                return;
        }
    }
}
