package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42737a;
    public final s f42738b;
    public final r f42739c;

    public p(s sVar, r rVar, int i10) {
        this.f42737a = i10;
        this.f42738b = sVar;
        this.f42739c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42737a) {
            case 0:
                s sVar = this.f42738b;
                sVar.getClass();
                this.f42739c.f42769c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42738b;
                sVar2.getClass();
                this.f42739c.f42769c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
