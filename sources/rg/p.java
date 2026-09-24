package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42688a;
    public final s f42689b;
    public final r f42690c;

    public p(s sVar, r rVar, int i10) {
        this.f42688a = i10;
        this.f42689b = sVar;
        this.f42690c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42688a) {
            case 0:
                s sVar = this.f42689b;
                sVar.getClass();
                this.f42690c.f42720c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42689b;
                sVar2.getClass();
                this.f42690c.f42720c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
