package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42672a;
    public final s f42673b;
    public final r f42674c;

    public p(s sVar, r rVar, int i10) {
        this.f42672a = i10;
        this.f42673b = sVar;
        this.f42674c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42672a) {
            case 0:
                s sVar = this.f42673b;
                sVar.getClass();
                this.f42674c.f42702c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42673b;
                sVar2.getClass();
                this.f42674c.f42702c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
