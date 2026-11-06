package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f56634a;
    public final r f56635b;
    public final q f56636c;

    public o(r rVar, q qVar, int i7) {
        this.f56634a = i7;
        this.f56635b = rVar;
        this.f56636c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56634a) {
            case 0:
                r rVar = this.f56635b;
                rVar.getClass();
                this.f56636c.f56696c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f56635b;
                rVar2.getClass();
                this.f56636c.f56696c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
