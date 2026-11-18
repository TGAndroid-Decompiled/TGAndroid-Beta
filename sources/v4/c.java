package v4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f59072a;
    public final k f59073b;

    public c(k kVar, f1 f1Var, int i7) {
        this.f59072a = i7;
        this.f59073b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f59072a) {
            case 0:
                this.f59073b.Q();
                return;
            default:
                this.f59073b.M();
                return;
        }
    }
}
