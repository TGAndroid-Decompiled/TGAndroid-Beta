package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f42960a;
    public final j f42961b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f42960a = i10;
        this.f42961b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42960a) {
            case 0:
                this.f42961b.Q();
                return;
            default:
                this.f42961b.M();
                return;
        }
    }
}
