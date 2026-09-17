package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42440a;
    public final s f42441b;
    public final r f42442c;

    public p(s sVar, r rVar, int i10) {
        this.f42440a = i10;
        this.f42441b = sVar;
        this.f42442c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42440a) {
            case 0:
                s sVar = this.f42441b;
                sVar.getClass();
                this.f42442c.f42470c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42441b;
                sVar2.getClass();
                this.f42442c.f42470c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
