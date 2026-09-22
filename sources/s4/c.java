package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f42981a;
    public final j f42982b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f42981a = i10;
        this.f42982b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42981a) {
            case 0:
                this.f42982b.Q();
                return;
            default:
                this.f42982b.M();
                return;
        }
    }
}
