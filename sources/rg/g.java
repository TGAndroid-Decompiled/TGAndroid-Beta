package rg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f45214a;
    public final k f45215b;

    public g(k kVar, int i10) {
        this.f45214a = i10;
        this.f45215b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45214a) {
            case 0:
                k kVar = this.f45215b;
                kVar.g(AndroidUtilities.lerpAngle(kVar.L, kVar.f45279i0, kVar.Q.getAnimatedFraction()));
                return;
            case 1:
                k kVar2 = this.f45215b;
                kVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.f45284n0 = floatValue;
                kVar2.setAlpha(floatValue);
                j jVar = kVar2.H;
                if (jVar != null) {
                    jVar.setScaleX(Utilities.clamp(kVar2.f45284n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, kVar2.f45280j0));
                    kVar2.H.setScaleY(Utilities.clamp(kVar2.f45284n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, kVar2.f45280j0));
                    kVar2.H.setAlpha(Math.max(0.0f, kVar2.f45284n0 - 0.8f) * kVar2.f45280j0 * 5.0f);
                }
                kVar2.invalidate();
                return;
            case 2:
                k kVar3 = this.f45215b;
                kVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.f45280j0 = floatValue2;
                j jVar2 = kVar3.H;
                if (jVar2 != null) {
                    jVar2.setScaleX(Utilities.clamp(kVar3.f45284n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, floatValue2));
                    kVar3.H.setScaleY(Utilities.clamp(kVar3.f45284n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, kVar3.f45280j0));
                    kVar3.H.setAlpha(Math.max(0.0f, kVar3.f45284n0 - 0.8f) * kVar3.f45280j0 * 5.0f);
                    return;
                }
                return;
            case 3:
                this.f45215b.k();
                return;
            case 4:
                this.f45215b.k();
                return;
            default:
                k kVar4 = this.f45215b;
                float lerpAngle = AndroidUtilities.lerpAngle(kVar4.f45279i0, kVar4.L, valueAnimator.getAnimatedFraction());
                kVar4.O = lerpAngle;
                kVar4.g(lerpAngle);
                return;
        }
    }
}
