package wf;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f49552a;
    public final g f49553b;

    public d(g gVar, int i10) {
        this.f49552a = i10;
        this.f49553b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49552a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f49553b;
                gVar.f49595g0 = floatValue;
                gVar.E = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f49553b;
                gVar2.f49597h0 = floatValue2;
                gVar2.E = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f49553b;
                gVar3.f49610s0 = floatValue3;
                gVar3.f49606q0.setAlpha(gVar3.f49610s0);
                gVar3.invalidate();
                return;
        }
    }
}
