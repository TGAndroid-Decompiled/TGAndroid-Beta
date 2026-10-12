package org.telegram.ui;

import android.animation.ValueAnimator;
public final class se implements ValueAnimator.AnimatorUpdateListener {
    public final int f41902a;
    public final eo f41903b;

    public se(eo eoVar, int i10) {
        this.f41902a = i10;
        this.f41903b = eoVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41902a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eo eoVar = this.f41903b;
                eoVar.K8 = floatValue;
                wm wmVar = eoVar.X0;
                if (wmVar != null) {
                    wmVar.invalidate();
                    eoVar.f37478x0.invalidate();
                    return;
                }
                return;
            case 1:
                eo eoVar2 = this.f41903b;
                eoVar2.getClass();
                eoVar2.f37292i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar2.pc();
                return;
            case 2:
                eo eoVar3 = this.f41903b;
                eoVar3.getClass();
                eoVar3.f37292i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar3.pc();
                return;
            case 3:
                eo eoVar4 = this.f41903b;
                eoVar4.getClass();
                eoVar4.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar4.t9();
                return;
            default:
                eo eoVar5 = this.f41903b;
                eoVar5.getClass();
                eoVar5.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar5.t9();
                return;
        }
    }
}
