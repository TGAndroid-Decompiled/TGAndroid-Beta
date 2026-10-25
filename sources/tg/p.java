package tg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f48972a;
    public final s f48973b;
    public final r f48974c;

    public p(s sVar, r rVar, int i10) {
        this.f48972a = i10;
        this.f48973b = sVar;
        this.f48974c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48972a) {
            case 0:
                s sVar = this.f48973b;
                sVar.getClass();
                this.f48974c.f49016c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f48973b;
                sVar2.getClass();
                this.f48974c.f49016c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
