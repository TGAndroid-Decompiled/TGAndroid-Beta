package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f42683a;
    public final j f42684b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f42683a = i10;
        this.f42684b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42683a) {
            case 0:
                this.f42684b.Q();
                return;
            default:
                this.f42684b.M();
                return;
        }
    }
}
