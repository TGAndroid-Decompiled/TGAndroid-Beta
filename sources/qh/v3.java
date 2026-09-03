package qh;

import android.animation.ValueAnimator;
public final class v3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46203a;
    public final a5 f46204b;

    public v3(a5 a5Var, int i10) {
        this.f46203a = i10;
        this.f46204b = a5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46203a) {
            case 0:
                a5 a5Var = this.f46204b;
                a5Var.getClass();
                a5Var.f44945m2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                a5 a5Var2 = this.f46204b;
                a5Var2.getClass();
                a5Var2.f44945m2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                a5 a5Var3 = this.f46204b;
                a5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a5Var3.Y1 = floatValue;
                a5Var3.W1.setTransitionProgress(floatValue);
                return;
        }
    }
}
