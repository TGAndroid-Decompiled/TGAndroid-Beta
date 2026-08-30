package ph;

import android.animation.ValueAnimator;
public final class w3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42500a;
    public final c5 f42501b;

    public w3(c5 c5Var, int i10) {
        this.f42500a = i10;
        this.f42501b = c5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42500a) {
            case 0:
                c5 c5Var = this.f42501b;
                c5Var.getClass();
                c5Var.f41349m2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                c5 c5Var2 = this.f42501b;
                c5Var2.getClass();
                c5Var2.f41349m2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                c5 c5Var3 = this.f42501b;
                c5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var3.Y1 = floatValue;
                c5Var3.W1.setTransitionProgress(floatValue);
                return;
        }
    }
}
