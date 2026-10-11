package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f47466a;
    public final s f47467b;
    public final r f47468c;

    public p(s sVar, r rVar, int i10) {
        this.f47466a = i10;
        this.f47467b = sVar;
        this.f47468c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47466a) {
            case 0:
                s sVar = this.f47467b;
                sVar.getClass();
                this.f47468c.f47509c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f47467b;
                sVar2.getClass();
                this.f47468c.f47509c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
