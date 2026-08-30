package ph;

import android.animation.ValueAnimator;
public final class s8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42311a;
    public final da f42312b;

    public s8(da daVar, int i10) {
        this.f42311a = i10;
        this.f42312b = daVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42311a) {
            case 0:
                this.f42312b.J0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f42312b.f41517o1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f42312b.f41517o1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f42312b.f41520p1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f42312b.f41520p1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                da daVar = this.f42312b;
                daVar.getClass();
                daVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.o();
                daVar.f41525r.invalidate();
                daVar.f41512n.invalidate();
                return;
        }
    }
}
