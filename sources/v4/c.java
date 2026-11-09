package v4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f57036a;
    public final k f57037b;

    public c(k kVar, d1 d1Var, int i7) {
        this.f57036a = i7;
        this.f57037b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f57036a) {
            case 0:
                this.f57037b.Q();
                return;
            default:
                this.f57037b.M();
                return;
        }
    }
}
