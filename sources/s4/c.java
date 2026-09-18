package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f42915a;
    public final j f42916b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f42915a = i10;
        this.f42916b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42915a) {
            case 0:
                this.f42916b.Q();
                return;
            default:
                this.f42916b.M();
                return;
        }
    }
}
