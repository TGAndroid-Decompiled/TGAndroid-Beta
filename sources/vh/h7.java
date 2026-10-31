package vh;

import android.animation.ValueAnimator;
public final class h7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51259a;
    public final o8 f51260b;

    public h7(o8 o8Var, int i10) {
        this.f51259a = i10;
        this.f51260b = o8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51259a) {
            case 0:
                this.f51260b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f51260b.f51659r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f51260b.f51659r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f51260b.f51663s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f51260b.f51663s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o8 o8Var = this.f51260b;
                o8Var.getClass();
                o8Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.n();
                o8Var.f51657r.invalidate();
                o8Var.f51644n.invalidate();
                return;
        }
    }
}
