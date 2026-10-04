package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f46510a;
    public final j f46511b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f46510a = i10;
        this.f46511b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46510a) {
            case 0:
                this.f46511b.Q();
                return;
            default:
                this.f46511b.M();
                return;
        }
    }
}
