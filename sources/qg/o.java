package qg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f46432a;
    public final m0 f46433b;

    public o(m0 m0Var, int i10) {
        this.f46432a = i10;
        this.f46433b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46432a) {
            case 0:
                m0 m0Var = this.f46433b;
                m0Var.getClass();
                m0Var.f46370f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f46433b;
                m0Var2.getClass();
                m0Var2.f46370f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
