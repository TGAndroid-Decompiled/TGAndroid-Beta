package th;

import android.animation.ValueAnimator;
public final class z6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49789a;
    public final c7 f49790b;

    public z6(c7 c7Var, int i10) {
        this.f49789a = i10;
        this.f49790b = c7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49789a) {
            case 0:
                o7 o7Var = this.f49790b.f48858r0;
                o7Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7.w(o7Var);
                return;
            default:
                o7 o7Var2 = this.f49790b.f48858r0;
                o7Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7.w(o7Var2);
                return;
        }
    }
}
