package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f47757a;
    public final j f47758b;

    public c(j jVar, d1 d1Var, int i10) {
        this.f47757a = i10;
        this.f47758b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47757a) {
            case 0:
                this.f47758b.Q();
                return;
            default:
                this.f47758b.M();
                return;
        }
    }
}
