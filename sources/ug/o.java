package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f58801a;
    public final r f58802b;
    public final q f58803c;

    public o(r rVar, q qVar, int i7) {
        this.f58801a = i7;
        this.f58802b = rVar;
        this.f58803c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58801a) {
            case 0:
                r rVar = this.f58802b;
                rVar.getClass();
                this.f58803c.f58825c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f58802b;
                rVar2.getClass();
                this.f58803c.f58825c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
