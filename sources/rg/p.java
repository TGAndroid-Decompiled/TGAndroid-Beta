package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46231a;
    public final s f46232b;
    public final r f46233c;

    public p(s sVar, r rVar, int i10) {
        this.f46231a = i10;
        this.f46232b = sVar;
        this.f46233c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46231a) {
            case 0:
                s sVar = this.f46232b;
                sVar.getClass();
                this.f46233c.f46275c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46232b;
                sVar2.getClass();
                this.f46233c.f46275c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
