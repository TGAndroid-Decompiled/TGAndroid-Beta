package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f42945a;
    public final j f42946b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f42945a = i10;
        this.f42946b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42945a) {
            case 0:
                this.f42946b.Q();
                return;
            default:
                this.f42946b.M();
                return;
        }
    }
}
