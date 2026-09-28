package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42702a;
    public final s f42703b;
    public final r f42704c;

    public p(s sVar, r rVar, int i10) {
        this.f42702a = i10;
        this.f42703b = sVar;
        this.f42704c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42702a) {
            case 0:
                s sVar = this.f42703b;
                sVar.getClass();
                this.f42704c.f42734c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42703b;
                sVar2.getClass();
                this.f42704c.f42734c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
