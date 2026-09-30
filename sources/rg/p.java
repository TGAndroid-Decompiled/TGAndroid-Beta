package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42810a;
    public final s f42811b;
    public final r f42812c;

    public p(s sVar, r rVar, int i10) {
        this.f42810a = i10;
        this.f42811b = sVar;
        this.f42812c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42810a) {
            case 0:
                s sVar = this.f42811b;
                sVar.getClass();
                this.f42812c.f42842c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42811b;
                sVar2.getClass();
                this.f42812c.f42842c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
