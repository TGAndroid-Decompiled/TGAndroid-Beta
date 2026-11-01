package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f47906a;
    public final j f47907b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f47906a = i10;
        this.f47907b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47906a) {
            case 0:
                this.f47907b.Q();
                return;
            default:
                this.f47907b.M();
                return;
        }
    }
}
