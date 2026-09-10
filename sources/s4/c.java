package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f41596a;
    public final j f41597b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f41596a = i10;
        this.f41597b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41596a) {
            case 0:
                this.f41597b.Q();
                return;
            default:
                this.f41597b.M();
                return;
        }
    }
}
