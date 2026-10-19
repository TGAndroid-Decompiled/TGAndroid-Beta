package sg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46364a;
    public final s f46365b;
    public final r f46366c;

    public p(s sVar, r rVar, int i10) {
        this.f46364a = i10;
        this.f46365b = sVar;
        this.f46366c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46364a) {
            case 0:
                s sVar = this.f46365b;
                sVar.getClass();
                this.f46366c.f46402c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46365b;
                sVar2.getClass();
                this.f46366c.f46402c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
