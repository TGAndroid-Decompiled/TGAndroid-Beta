package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f47677a;
    public final j f47678b;

    public c(j jVar, d1 d1Var, int i10) {
        this.f47677a = i10;
        this.f47678b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47677a) {
            case 0:
                this.f47678b.Q();
                return;
            default:
                this.f47678b.M();
                return;
        }
    }
}
