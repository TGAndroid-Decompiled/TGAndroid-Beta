package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f43054a;
    public final j f43055b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f43054a = i10;
        this.f43055b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43054a) {
            case 0:
                this.f43055b.Q();
                return;
            default:
                this.f43055b.M();
                return;
        }
    }
}
