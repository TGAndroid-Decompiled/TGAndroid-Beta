package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42414a;
    public final s f42415b;
    public final r f42416c;

    public p(s sVar, r rVar, int i10) {
        this.f42414a = i10;
        this.f42415b = sVar;
        this.f42416c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42414a) {
            case 0:
                s sVar = this.f42415b;
                sVar.getClass();
                this.f42416c.f42444c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42415b;
                sVar2.getClass();
                this.f42416c.f42444c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
