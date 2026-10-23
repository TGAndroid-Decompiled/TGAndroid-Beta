package sg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46373a;
    public final s f46374b;
    public final r f46375c;

    public p(s sVar, r rVar, int i10) {
        this.f46373a = i10;
        this.f46374b = sVar;
        this.f46375c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46373a) {
            case 0:
                s sVar = this.f46374b;
                sVar.getClass();
                this.f46375c.f46411c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46374b;
                sVar2.getClass();
                this.f46375c.f46411c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
