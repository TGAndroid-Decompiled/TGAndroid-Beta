package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f45752a;
    public final j f45753b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f45752a = i10;
        this.f45753b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45752a) {
            case 0:
                this.f45753b.Q();
                return;
            default:
                this.f45753b.M();
                return;
        }
    }
}
