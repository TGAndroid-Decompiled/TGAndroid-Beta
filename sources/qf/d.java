package qf;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f46167a;
    public final g f46168b;

    public d(g gVar, int i9) {
        this.f46167a = i9;
        this.f46168b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46167a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f46168b;
                gVar.f46208f0 = floatValue;
                gVar.D = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f46168b;
                gVar2.f46210g0 = floatValue2;
                gVar2.D = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f46168b;
                gVar3.f46222r0 = floatValue3;
                gVar3.f46219p0.setAlpha(gVar3.f46222r0);
                gVar3.invalidate();
                return;
        }
    }
}
