package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f56610a;
    public final r f56611b;
    public final q f56612c;

    public o(r rVar, q qVar, int i7) {
        this.f56610a = i7;
        this.f56611b = rVar;
        this.f56612c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56610a) {
            case 0:
                r rVar = this.f56611b;
                rVar.getClass();
                this.f56612c.f56672c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f56611b;
                rVar2.getClass();
                this.f56612c.f56672c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
