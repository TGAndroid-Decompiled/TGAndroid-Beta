package ph;

import android.animation.ValueAnimator;
public final class w7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42513a;
    public final x7 f42514b;

    public w7(x7 x7Var, int i10) {
        this.f42513a = i10;
        this.f42514b = x7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42513a) {
            case 0:
                x7.a(this.f42514b, valueAnimator);
                return;
            default:
                x7 x7Var = this.f42514b;
                x7Var.getClass();
                x7Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
