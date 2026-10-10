package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f47420a;
    public final s f47421b;
    public final r f47422c;

    public p(s sVar, r rVar, int i10) {
        this.f47420a = i10;
        this.f47421b = sVar;
        this.f47422c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47420a) {
            case 0:
                s sVar = this.f47421b;
                sVar.getClass();
                this.f47422c.f47463c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f47421b;
                sVar2.getClass();
                this.f47422c.f47463c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
