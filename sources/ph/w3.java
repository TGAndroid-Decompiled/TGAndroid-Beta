package ph;

import android.animation.ValueAnimator;
public final class w3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42533a;
    public final c5 f42534b;

    public w3(c5 c5Var, int i10) {
        this.f42533a = i10;
        this.f42534b = c5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42533a) {
            case 0:
                c5 c5Var = this.f42534b;
                c5Var.getClass();
                c5Var.f41389m2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                c5 c5Var2 = this.f42534b;
                c5Var2.getClass();
                c5Var2.f41389m2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                c5 c5Var3 = this.f42534b;
                c5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var3.Y1 = floatValue;
                c5Var3.W1.setTransitionProgress(floatValue);
                return;
        }
    }
}
