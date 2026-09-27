package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42747a;
    public final s f42748b;
    public final r f42749c;

    public p(s sVar, r rVar, int i10) {
        this.f42747a = i10;
        this.f42748b = sVar;
        this.f42749c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42747a) {
            case 0:
                s sVar = this.f42748b;
                sVar.getClass();
                this.f42749c.f42779c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42748b;
                sVar2.getClass();
                this.f42749c.f42779c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
