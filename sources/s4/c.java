package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f42991a;
    public final j f42992b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f42991a = i10;
        this.f42992b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42991a) {
            case 0:
                this.f42992b.Q();
                return;
            default:
                this.f42992b.M();
                return;
        }
    }
}
