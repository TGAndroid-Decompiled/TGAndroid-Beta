package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f42661a;
    public final j f42662b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f42661a = i10;
        this.f42662b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42661a) {
            case 0:
                this.f42662b.Q();
                return;
            default:
                this.f42662b.M();
                return;
        }
    }
}
