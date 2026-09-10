package pg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f40201a;
    public final m0 f40202b;

    public o(m0 m0Var, int i10) {
        this.f40201a = i10;
        this.f40202b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40201a) {
            case 0:
                m0 m0Var = this.f40202b;
                m0Var.getClass();
                m0Var.f40133f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f40202b;
                m0Var2.getClass();
                m0Var2.f40133f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
