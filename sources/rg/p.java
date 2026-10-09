package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f47376a;
    public final s f47377b;
    public final r f47378c;

    public p(s sVar, r rVar, int i10) {
        this.f47376a = i10;
        this.f47377b = sVar;
        this.f47378c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47376a) {
            case 0:
                s sVar = this.f47377b;
                sVar.getClass();
                this.f47378c.f47419c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f47377b;
                sVar2.getClass();
                this.f47378c.f47419c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
