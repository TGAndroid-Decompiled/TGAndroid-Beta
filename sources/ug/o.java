package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f58852a;
    public final r f58853b;
    public final q f58854c;

    public o(r rVar, q qVar, int i7) {
        this.f58852a = i7;
        this.f58853b = rVar;
        this.f58854c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58852a) {
            case 0:
                r rVar = this.f58853b;
                rVar.getClass();
                this.f58854c.f58876c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f58853b;
                rVar2.getClass();
                this.f58854c.f58876c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
