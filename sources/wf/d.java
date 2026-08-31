package wf;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f49515a;
    public final g f49516b;

    public d(g gVar, int i10) {
        this.f49515a = i10;
        this.f49516b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49515a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f49516b;
                gVar.f49558g0 = floatValue;
                gVar.E = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f49516b;
                gVar2.f49560h0 = floatValue2;
                gVar2.E = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f49516b;
                gVar3.f49573s0 = floatValue3;
                gVar3.f49569q0.setAlpha(gVar3.f49573s0);
                gVar3.invalidate();
                return;
        }
    }
}
