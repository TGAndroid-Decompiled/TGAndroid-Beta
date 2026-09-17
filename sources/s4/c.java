package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f45753a;
    public final j f45754b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f45753a = i10;
        this.f45754b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45753a) {
            case 0:
                this.f45754b.Q();
                return;
            default:
                this.f45754b.M();
                return;
        }
    }
}
