package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f47633a;
    public final j f47634b;

    public c(j jVar, d1 d1Var, int i10) {
        this.f47633a = i10;
        this.f47634b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47633a) {
            case 0:
                this.f47634b.Q();
                return;
            default:
                this.f47634b.M();
                return;
        }
    }
}
