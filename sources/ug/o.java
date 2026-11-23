package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f58932a;
    public final r f58933b;
    public final q f58934c;

    public o(r rVar, q qVar, int i7) {
        this.f58932a = i7;
        this.f58933b = rVar;
        this.f58934c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58932a) {
            case 0:
                r rVar = this.f58933b;
                rVar.getClass();
                this.f58934c.f58956c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f58933b;
                rVar2.getClass();
                this.f58934c.f58956c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
