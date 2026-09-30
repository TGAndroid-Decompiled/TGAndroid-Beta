package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f42948a;
    public final j f42949b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f42948a = i10;
        this.f42949b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42948a) {
            case 0:
                this.f42949b.Q();
                return;
            default:
                this.f42949b.M();
                return;
        }
    }
}
