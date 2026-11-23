package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f58817a;
    public final r f58818b;
    public final q f58819c;

    public o(r rVar, q qVar, int i7) {
        this.f58817a = i7;
        this.f58818b = rVar;
        this.f58819c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58817a) {
            case 0:
                r rVar = this.f58818b;
                rVar.getClass();
                this.f58819c.f58841c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f58818b;
                rVar2.getClass();
                this.f58819c.f58841c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
