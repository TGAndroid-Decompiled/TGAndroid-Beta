package rg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f45589a;
    public final m0 f45590b;

    public o(m0 m0Var, int i10) {
        this.f45589a = i10;
        this.f45590b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45589a) {
            case 0:
                m0 m0Var = this.f45590b;
                m0Var.getClass();
                m0Var.f45522f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f45590b;
                m0Var2.getClass();
                m0Var2.f45522f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
