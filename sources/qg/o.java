package qg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f46430a;
    public final m0 f46431b;

    public o(m0 m0Var, int i10) {
        this.f46430a = i10;
        this.f46431b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46430a) {
            case 0:
                m0 m0Var = this.f46431b;
                m0Var.getClass();
                m0Var.f46368f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f46431b;
                m0Var2.getClass();
                m0Var2.f46368f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
