package sg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46247a;
    public final s f46248b;
    public final r f46249c;

    public p(s sVar, r rVar, int i10) {
        this.f46247a = i10;
        this.f46248b = sVar;
        this.f46249c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46247a) {
            case 0:
                s sVar = this.f46248b;
                sVar.getClass();
                this.f46249c.f46260c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46248b;
                sVar2.getClass();
                this.f46249c.f46260c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
