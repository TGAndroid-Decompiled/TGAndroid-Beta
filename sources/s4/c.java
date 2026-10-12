package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f47872a;
    public final j f47873b;

    public c(j jVar, d1 d1Var, int i10) {
        this.f47872a = i10;
        this.f47873b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47872a) {
            case 0:
                this.f47873b.Q();
                return;
            default:
                this.f47873b.M();
                return;
        }
    }
}
