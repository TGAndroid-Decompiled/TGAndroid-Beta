package vh;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51074a;
    public final b4 f51075b;

    public d3(b4 b4Var, int i10) {
        this.f51074a = i10;
        this.f51075b = b4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51074a) {
            case 0:
                b4 b4Var = this.f51075b;
                b4Var.getClass();
                b4Var.Y1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                b4 b4Var2 = this.f51075b;
                b4Var2.getClass();
                b4Var2.Y1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                b4 b4Var3 = this.f51075b;
                b4Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var3.K1 = floatValue;
                b4Var3.I1.setTransitionProgress(floatValue);
                return;
        }
    }
}
