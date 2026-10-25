package sg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f48388a;
    public final n0 f48389b;

    public o(n0 n0Var, int i10) {
        this.f48388a = i10;
        this.f48389b = n0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48388a) {
            case 0:
                n0 n0Var = this.f48389b;
                n0Var.getClass();
                n0Var.U1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                n0 n0Var2 = this.f48389b;
                n0Var2.getClass();
                n0Var2.U1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
