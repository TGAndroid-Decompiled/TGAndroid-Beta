package qh;

import android.animation.ValueAnimator;
public final class w3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46220a;
    public final b5 f46221b;

    public w3(b5 b5Var, int i10) {
        this.f46220a = i10;
        this.f46221b = b5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46220a) {
            case 0:
                b5 b5Var = this.f46221b;
                b5Var.getClass();
                b5Var.f44968m2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                b5 b5Var2 = this.f46221b;
                b5Var2.getClass();
                b5Var2.f44968m2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                b5 b5Var3 = this.f46221b;
                b5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b5Var3.Y1 = floatValue;
                b5Var3.W1.setTransitionProgress(floatValue);
                return;
        }
    }
}
