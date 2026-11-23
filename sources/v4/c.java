package v4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f59115a;
    public final k f59116b;

    public c(k kVar, f1 f1Var, int i7) {
        this.f59115a = i7;
        this.f59116b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f59115a) {
            case 0:
                this.f59116b.Q();
                return;
            default:
                this.f59116b.M();
                return;
        }
    }
}
