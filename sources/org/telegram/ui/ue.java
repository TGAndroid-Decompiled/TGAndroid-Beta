package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ue implements ValueAnimator.AnimatorUpdateListener {
    public final int f40379a;
    public final fo f40380b;

    public ue(fo foVar, int i10) {
        this.f40379a = i10;
        this.f40380b = foVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40379a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fo foVar = this.f40380b;
                foVar.K8 = floatValue;
                xm xmVar = foVar.X0;
                if (xmVar != null) {
                    xmVar.invalidate();
                    foVar.f35861x0.invalidate();
                    return;
                }
                return;
            case 1:
                fo foVar2 = this.f40380b;
                foVar2.getClass();
                foVar2.f35675i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar2.pc();
                return;
            case 2:
                fo foVar3 = this.f40380b;
                foVar3.getClass();
                foVar3.f35675i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar3.pc();
                return;
            case 3:
                fo foVar4 = this.f40380b;
                foVar4.getClass();
                foVar4.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar4.t9();
                return;
            default:
                fo foVar5 = this.f40380b;
                foVar5.getClass();
                foVar5.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar5.t9();
                return;
        }
    }
}
