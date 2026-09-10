package zh;

import android.animation.ValueAnimator;
public final class k1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48580a;
    public final a3 f48581b;

    public k1(a3 a3Var, int i10) {
        this.f48580a = i10;
        this.f48581b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48580a) {
            case 0:
                a3 a3Var = this.f48581b;
                a3Var.getClass();
                a3Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var.invalidate();
                return;
            case 1:
                a3 a3Var2 = this.f48581b;
                a3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var2.f48213t3 = floatValue;
                a3Var2.f48207r3.setTransitionProgress(floatValue);
                return;
            default:
                a3.Z(this.f48581b, valueAnimator);
                return;
        }
    }
}
