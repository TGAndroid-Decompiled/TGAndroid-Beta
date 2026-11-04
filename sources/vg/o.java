package vg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f56756a;
    public final r f56757b;
    public final q f56758c;

    public o(r rVar, q qVar, int i3) {
        this.f56756a = i3;
        this.f56757b = rVar;
        this.f56758c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56756a) {
            case 0:
                r rVar = this.f56757b;
                rVar.getClass();
                this.f56758c.f56786c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f56757b;
                rVar2.getClass();
                this.f56758c.f56786c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
