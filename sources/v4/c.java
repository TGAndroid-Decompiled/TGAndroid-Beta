package v4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f59087a;
    public final k f59088b;

    public c(k kVar, e1 e1Var, int i7) {
        this.f59087a = i7;
        this.f59088b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f59087a) {
            case 0:
                this.f59088b.Q();
                return;
            default:
                this.f59088b.M();
                return;
        }
    }
}
