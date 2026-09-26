package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42701a;
    public final s f42702b;
    public final r f42703c;

    public p(s sVar, r rVar, int i10) {
        this.f42701a = i10;
        this.f42702b = sVar;
        this.f42703c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42701a) {
            case 0:
                s sVar = this.f42702b;
                sVar.getClass();
                this.f42703c.f42733c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42702b;
                sVar2.getClass();
                this.f42703c.f42733c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
