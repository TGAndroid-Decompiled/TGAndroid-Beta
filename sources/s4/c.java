package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f42613a;
    public final j f42614b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f42613a = i10;
        this.f42614b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42613a) {
            case 0:
                this.f42614b.Q();
                return;
            default:
                this.f42614b.M();
                return;
        }
    }
}
