package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f56635a;
    public final r f56636b;
    public final q f56637c;

    public o(r rVar, q qVar, int i7) {
        this.f56635a = i7;
        this.f56636b = rVar;
        this.f56637c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56635a) {
            case 0:
                r rVar = this.f56636b;
                rVar.getClass();
                this.f56637c.f56697c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f56636b;
                rVar2.getClass();
                this.f56637c.f56697c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
