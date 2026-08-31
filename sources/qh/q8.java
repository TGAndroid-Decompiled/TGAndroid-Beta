package qh;

import android.animation.ValueAnimator;
public final class q8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45917a;
    public final ca f45918b;

    public q8(ca caVar, int i10) {
        this.f45917a = i10;
        this.f45918b = caVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45917a) {
            case 0:
                this.f45918b.J0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f45918b.f45120o1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f45918b.f45120o1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f45918b.f45123p1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f45918b.f45123p1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ca caVar = this.f45918b;
                caVar.getClass();
                caVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                caVar.o();
                caVar.f45128r.invalidate();
                caVar.f45115n.invalidate();
                return;
        }
    }
}
