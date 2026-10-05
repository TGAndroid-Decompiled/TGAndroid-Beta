package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46245a;
    public final s f46246b;
    public final r f46247c;

    public p(s sVar, r rVar, int i10) {
        this.f46245a = i10;
        this.f46246b = sVar;
        this.f46247c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46245a) {
            case 0:
                s sVar = this.f46246b;
                sVar.getClass();
                this.f46247c.f46289c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46246b;
                sVar2.getClass();
                this.f46247c.f46289c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
