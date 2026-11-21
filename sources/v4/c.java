package v4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f59111a;
    public final k f59112b;

    public c(k kVar, f1 f1Var, int i7) {
        this.f59111a = i7;
        this.f59112b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f59111a) {
            case 0:
                this.f59112b.Q();
                return;
            default:
                this.f59112b.M();
                return;
        }
    }
}
