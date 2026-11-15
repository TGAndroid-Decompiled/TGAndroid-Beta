package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f58235a;
    public final r f58236b;
    public final q f58237c;

    public o(r rVar, q qVar, int i7) {
        this.f58235a = i7;
        this.f58236b = rVar;
        this.f58237c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58235a) {
            case 0:
                r rVar = this.f58236b;
                rVar.getClass();
                this.f58237c.f58260c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f58236b;
                rVar2.getClass();
                this.f58237c.f58260c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
