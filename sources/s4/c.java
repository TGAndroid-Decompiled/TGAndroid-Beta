package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f47631a;
    public final j f47632b;

    public c(j jVar, d1 d1Var, int i10) {
        this.f47631a = i10;
        this.f47632b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47631a) {
            case 0:
                this.f47632b.Q();
                return;
            default:
                this.f47632b.M();
                return;
        }
    }
}
