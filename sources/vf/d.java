package vf;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f45757a;
    public final g f45758b;

    public d(g gVar, int i10) {
        this.f45757a = i10;
        this.f45758b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45757a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f45758b;
                gVar.f45798g0 = floatValue;
                gVar.E = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f45758b;
                gVar2.f45800h0 = floatValue2;
                gVar2.E = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f45758b;
                gVar3.f45813s0 = floatValue3;
                gVar3.f45809q0.setAlpha(gVar3.f45813s0);
                gVar3.invalidate();
                return;
        }
    }
}
