package vh;

import android.animation.ValueAnimator;
public final class r7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51881a;
    public final o8 f51882b;

    public r7(o8 o8Var, int i10) {
        this.f51881a = i10;
        this.f51882b = o8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51881a) {
            case 0:
                this.f51882b.f51628c1.m();
                return;
            default:
                this.f51882b.m0();
                return;
        }
    }
}
