package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f42947a;
    public final j f42948b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f42947a = i10;
        this.f42948b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42947a) {
            case 0:
                this.f42948b.Q();
                return;
            default:
                this.f42948b.M();
                return;
        }
    }
}
