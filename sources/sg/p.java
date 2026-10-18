package sg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46394a;
    public final s f46395b;
    public final r f46396c;

    public p(s sVar, r rVar, int i10) {
        this.f46394a = i10;
        this.f46395b = sVar;
        this.f46396c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46394a) {
            case 0:
                s sVar = this.f46395b;
                sVar.getClass();
                this.f46396c.f46436c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46395b;
                sVar2.getClass();
                this.f46396c.f46436c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
