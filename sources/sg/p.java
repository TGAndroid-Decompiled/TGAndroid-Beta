package sg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46797a;
    public final s f46798b;
    public final r f46799c;

    public p(s sVar, r rVar, int i10) {
        this.f46797a = i10;
        this.f46798b = sVar;
        this.f46799c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46797a) {
            case 0:
                s sVar = this.f46798b;
                sVar.getClass();
                this.f46799c.f46839c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46798b;
                sVar2.getClass();
                this.f46799c.f46839c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
