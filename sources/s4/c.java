package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f42932a;
    public final j f42933b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f42932a = i10;
        this.f42933b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42932a) {
            case 0:
                this.f42933b.Q();
                return;
            default:
                this.f42933b.M();
                return;
        }
    }
}
