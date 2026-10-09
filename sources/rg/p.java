package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f47374a;
    public final s f47375b;
    public final r f47376c;

    public p(s sVar, r rVar, int i10) {
        this.f47374a = i10;
        this.f47375b = sVar;
        this.f47376c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47374a) {
            case 0:
                s sVar = this.f47375b;
                sVar.getClass();
                this.f47376c.f47417c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f47375b;
                sVar2.getClass();
                this.f47376c.f47417c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
