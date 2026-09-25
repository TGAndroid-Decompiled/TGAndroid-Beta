package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42703a;
    public final s f42704b;
    public final r f42705c;

    public p(s sVar, r rVar, int i10) {
        this.f42703a = i10;
        this.f42704b = sVar;
        this.f42705c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42703a) {
            case 0:
                s sVar = this.f42704b;
                sVar.getClass();
                this.f42705c.f42735c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42704b;
                sVar2.getClass();
                this.f42705c.f42735c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
