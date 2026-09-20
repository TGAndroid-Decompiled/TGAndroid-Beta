package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42716a;
    public final s f42717b;
    public final r f42718c;

    public p(s sVar, r rVar, int i10) {
        this.f42716a = i10;
        this.f42717b = sVar;
        this.f42718c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42716a) {
            case 0:
                s sVar = this.f42717b;
                sVar.getClass();
                this.f42718c.f42748c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42717b;
                sVar2.getClass();
                this.f42718c.f42748c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
