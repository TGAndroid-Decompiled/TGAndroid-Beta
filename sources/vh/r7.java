package vh;

import android.animation.ValueAnimator;
public final class r7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51896a;
    public final o8 f51897b;

    public r7(o8 o8Var, int i10) {
        this.f51896a = i10;
        this.f51897b = o8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51896a) {
            case 0:
                this.f51897b.f51613c1.m();
                return;
            default:
                this.f51897b.m0();
                return;
        }
    }
}
