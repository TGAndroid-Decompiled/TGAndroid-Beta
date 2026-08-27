package rf;

import android.animation.ValueAnimator;

public final class d implements ValueAnimator.AnimatorUpdateListener {

    public final int f46926a;

    public final g f46927b;

    public d(g gVar, int i10) {
        this.f46926a = i10;
        this.f46927b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46926a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f46927b;
                gVar.f46967f0 = fFloatValue;
                gVar.D = true;
                gVar.invalidate();
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f46927b;
                gVar2.f46969g0 = fFloatValue2;
                gVar2.D = true;
                gVar2.invalidate();
                break;
            default:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f46927b;
                gVar3.f46981r0 = fFloatValue3;
                gVar3.f46978p0.setAlpha(gVar3.f46981r0);
                gVar3.invalidate();
                break;
        }
    }
}
