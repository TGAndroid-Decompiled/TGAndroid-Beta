package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f42946a;
    public final j f42947b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f42946a = i10;
        this.f42947b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42946a) {
            case 0:
                this.f42947b.Q();
                return;
            default:
                this.f42947b.M();
                return;
        }
    }
}
