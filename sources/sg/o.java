package sg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f48428a;
    public final m0 f48429b;

    public o(m0 m0Var, int i10) {
        this.f48428a = i10;
        this.f48429b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48428a) {
            case 0:
                m0 m0Var = this.f48429b;
                m0Var.getClass();
                m0Var.U1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f48429b;
                m0Var2.getClass();
                m0Var2.U1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
