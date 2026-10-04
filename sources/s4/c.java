package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f46509a;
    public final j f46510b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f46509a = i10;
        this.f46510b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46509a) {
            case 0:
                this.f46510b.Q();
                return;
            default:
                this.f46510b.M();
                return;
        }
    }
}
