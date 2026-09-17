package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f45725a;
    public final j f45726b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f45725a = i10;
        this.f45726b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45725a) {
            case 0:
                this.f45726b.Q();
                return;
            default:
                this.f45726b.M();
                return;
        }
    }
}
