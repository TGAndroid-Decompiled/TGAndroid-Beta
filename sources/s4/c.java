package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f47723a;
    public final j f47724b;

    public c(j jVar, d1 d1Var, int i10) {
        this.f47723a = i10;
        this.f47724b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47723a) {
            case 0:
                this.f47724b.Q();
                return;
            default:
                this.f47724b.M();
                return;
        }
    }
}
