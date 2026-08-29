package tf;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f48226a;
    public final g f48227b;

    public d(g gVar, int i10) {
        this.f48226a = i10;
        this.f48227b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48226a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f48227b;
                gVar.f48267f0 = floatValue;
                gVar.D = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f48227b;
                gVar2.f48269g0 = floatValue2;
                gVar2.D = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f48227b;
                gVar3.f48281r0 = floatValue3;
                gVar3.f48278p0.setAlpha(gVar3.f48281r0);
                gVar3.invalidate();
                return;
        }
    }
}
