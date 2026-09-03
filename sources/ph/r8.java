package ph;

import android.animation.ValueAnimator;
public final class r8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42290a;
    public final da f42291b;

    public r8(da daVar, int i10) {
        this.f42290a = i10;
        this.f42291b = daVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42290a) {
            case 0:
                this.f42291b.J0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f42291b.f41555o1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f42291b.f41555o1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f42291b.f41558p1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f42291b.f41558p1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                da daVar = this.f42291b;
                daVar.getClass();
                daVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.o();
                daVar.f41563r.invalidate();
                daVar.f41550n.invalidate();
                return;
        }
    }
}
