package sg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46374a;
    public final s f46375b;
    public final r f46376c;

    public p(s sVar, r rVar, int i10) {
        this.f46374a = i10;
        this.f46375b = sVar;
        this.f46376c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46374a) {
            case 0:
                s sVar = this.f46375b;
                sVar.getClass();
                this.f46376c.f46416c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46375b;
                sVar2.getClass();
                this.f46376c.f46416c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
