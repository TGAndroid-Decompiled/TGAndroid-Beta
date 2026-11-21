package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f58848a;
    public final r f58849b;
    public final q f58850c;

    public o(r rVar, q qVar, int i7) {
        this.f58848a = i7;
        this.f58849b = rVar;
        this.f58850c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58848a) {
            case 0:
                r rVar = this.f58849b;
                rVar.getClass();
                this.f58850c.f58872c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f58849b;
                rVar2.getClass();
                this.f58850c.f58872c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
