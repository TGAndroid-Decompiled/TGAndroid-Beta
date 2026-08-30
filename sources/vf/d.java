package vf;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f45679a;
    public final g f45680b;

    public d(g gVar, int i10) {
        this.f45679a = i10;
        this.f45680b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45679a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f45680b;
                gVar.f45720g0 = floatValue;
                gVar.E = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f45680b;
                gVar2.f45722h0 = floatValue2;
                gVar2.E = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f45680b;
                gVar3.f45735s0 = floatValue3;
                gVar3.f45731q0.setAlpha(gVar3.f45735s0);
                gVar3.invalidate();
                return;
        }
    }
}
