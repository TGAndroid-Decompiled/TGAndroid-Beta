package qg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f41873a;
    public final m0 f41874b;

    public o(m0 m0Var, int i10) {
        this.f41873a = i10;
        this.f41874b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41873a) {
            case 0:
                m0 m0Var = this.f41874b;
                m0Var.getClass();
                m0Var.f41805f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f41874b;
                m0Var2.getClass();
                m0Var2.f41805f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
