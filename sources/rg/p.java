package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f47500a;
    public final s f47501b;
    public final r f47502c;

    public p(s sVar, r rVar, int i10) {
        this.f47500a = i10;
        this.f47501b = sVar;
        this.f47502c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47500a) {
            case 0:
                s sVar = this.f47501b;
                sVar.getClass();
                this.f47502c.f47543c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f47501b;
                sVar2.getClass();
                this.f47502c.f47543c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
