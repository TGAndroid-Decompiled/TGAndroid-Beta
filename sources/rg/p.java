package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42369a;
    public final s f42370b;
    public final r f42371c;

    public p(s sVar, r rVar, int i10) {
        this.f42369a = i10;
        this.f42370b = sVar;
        this.f42371c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42369a) {
            case 0:
                s sVar = this.f42370b;
                sVar.getClass();
                this.f42371c.f42399c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42370b;
                sVar2.getClass();
                this.f42371c.f42399c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
