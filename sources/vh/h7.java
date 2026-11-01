package vh;

import android.animation.ValueAnimator;
public final class h7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51274a;
    public final o8 f51275b;

    public h7(o8 o8Var, int i10) {
        this.f51274a = i10;
        this.f51275b = o8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51274a) {
            case 0:
                this.f51275b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f51275b.f51674r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f51275b.f51674r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f51275b.f51678s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f51275b.f51678s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o8 o8Var = this.f51275b;
                o8Var.getClass();
                o8Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.n();
                o8Var.f51672r.invalidate();
                o8Var.f51659n.invalidate();
                return;
        }
    }
}
