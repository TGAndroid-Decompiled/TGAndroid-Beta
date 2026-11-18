package v4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f59073a;
    public final k f59074b;

    public c(k kVar, f1 f1Var, int i7) {
        this.f59073a = i7;
        this.f59074b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f59073a) {
            case 0:
                this.f59074b.Q();
                return;
            default:
                this.f59074b.M();
                return;
        }
    }
}
