package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f46517a;
    public final j f46518b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f46517a = i10;
        this.f46518b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46517a) {
            case 0:
                this.f46518b.Q();
                return;
            default:
                this.f46518b.M();
                return;
        }
    }
}
