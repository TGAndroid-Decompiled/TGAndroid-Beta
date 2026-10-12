package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f47864a;
    public final j f47865b;

    public c(j jVar, d1 d1Var, int i10) {
        this.f47864a = i10;
        this.f47865b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47864a) {
            case 0:
                this.f47865b.Q();
                return;
            default:
                this.f47865b.M();
                return;
        }
    }
}
