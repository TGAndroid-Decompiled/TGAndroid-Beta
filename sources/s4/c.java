package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f46524a;
    public final j f46525b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f46524a = i10;
        this.f46525b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46524a) {
            case 0:
                this.f46525b.Q();
                return;
            default:
                this.f46525b.M();
                return;
        }
    }
}
