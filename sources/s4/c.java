package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f47895a;
    public final j f47896b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f47895a = i10;
        this.f47896b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47895a) {
            case 0:
                this.f47896b.Q();
                return;
            default:
                this.f47896b.M();
                return;
        }
    }
}
