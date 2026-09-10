package zh;

import android.animation.ValueAnimator;
public final class f7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48421a;
    public final i7 f48422b;

    public f7(i7 i7Var, int i10) {
        this.f48421a = i10;
        this.f48422b = i7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48421a) {
            case 0:
                u7 u7Var = this.f48422b.I0;
                u7Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7.k(u7Var);
                return;
            default:
                u7 u7Var2 = this.f48422b.I0;
                u7Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7.k(u7Var2);
                return;
        }
    }
}
