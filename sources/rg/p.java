package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f47590a;
    public final s f47591b;
    public final r f47592c;

    public p(s sVar, r rVar, int i10) {
        this.f47590a = i10;
        this.f47591b = sVar;
        this.f47592c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47590a) {
            case 0:
                s sVar = this.f47591b;
                sVar.getClass();
                this.f47592c.f47633c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f47591b;
                sVar2.getClass();
                this.f47592c.f47633c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
