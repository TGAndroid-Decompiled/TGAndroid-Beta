package sg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46796a;
    public final s f46797b;
    public final r f46798c;

    public p(s sVar, r rVar, int i10) {
        this.f46796a = i10;
        this.f46797b = sVar;
        this.f46798c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46796a) {
            case 0:
                s sVar = this.f46797b;
                sVar.getClass();
                this.f46798c.f46838c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46797b;
                sVar2.getClass();
                this.f46798c.f46838c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
