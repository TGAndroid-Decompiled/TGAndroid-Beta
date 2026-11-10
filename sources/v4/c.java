package v4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f57032a;
    public final k f57033b;

    public c(k kVar, d1 d1Var, int i7) {
        this.f57032a = i7;
        this.f57033b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f57032a) {
            case 0:
                this.f57033b.Q();
                return;
            default:
                this.f57033b.M();
                return;
        }
    }
}
