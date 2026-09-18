package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42445a;
    public final s f42446b;
    public final r f42447c;

    public p(s sVar, r rVar, int i10) {
        this.f42445a = i10;
        this.f42446b = sVar;
        this.f42447c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42445a) {
            case 0:
                s sVar = this.f42446b;
                sVar.getClass();
                this.f42447c.f42475c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42446b;
                sVar2.getClass();
                this.f42447c.f42475c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
