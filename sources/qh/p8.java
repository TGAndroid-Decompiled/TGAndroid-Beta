package qh;

import android.animation.ValueAnimator;
public final class p8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45899a;
    public final ba f45900b;

    public p8(ba baVar, int i10) {
        this.f45899a = i10;
        this.f45900b = baVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45899a) {
            case 0:
                this.f45900b.J0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f45900b.f45086o1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f45900b.f45086o1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f45900b.f45089p1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f45900b.f45089p1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ba baVar = this.f45900b;
                baVar.getClass();
                baVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.o();
                baVar.f45094r.invalidate();
                baVar.f45081n.invalidate();
                return;
        }
    }
}
