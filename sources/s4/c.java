package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f45724a;
    public final j f45725b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f45724a = i10;
        this.f45725b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45724a) {
            case 0:
                this.f45725b.Q();
                return;
            default:
                this.f45725b.M();
                return;
        }
    }
}
