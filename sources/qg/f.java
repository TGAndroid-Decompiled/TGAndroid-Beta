package qg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final int f45019a;
    public final j f45020b;

    public f(j jVar, int i10) {
        this.f45019a = i10;
        this.f45020b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45019a) {
            case 0:
                j jVar = this.f45020b;
                jVar.g(AndroidUtilities.lerpAngle(jVar.L, jVar.f45082i0, jVar.Q.getAnimatedFraction()));
                return;
            case 1:
                j jVar2 = this.f45020b;
                jVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar2.f45087n0 = floatValue;
                jVar2.setAlpha(floatValue);
                i iVar = jVar2.H;
                if (iVar != null) {
                    iVar.setScaleX(Utilities.clamp(jVar2.f45087n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.f45083j0));
                    jVar2.H.setScaleY(Utilities.clamp(jVar2.f45087n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.f45083j0));
                    jVar2.H.setAlpha(Math.max(0.0f, jVar2.f45087n0 - 0.8f) * jVar2.f45083j0 * 5.0f);
                }
                jVar2.invalidate();
                return;
            case 2:
                j jVar3 = this.f45020b;
                jVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar3.f45083j0 = floatValue2;
                i iVar2 = jVar3.H;
                if (iVar2 != null) {
                    iVar2.setScaleX(Utilities.clamp(jVar3.f45087n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, floatValue2));
                    jVar3.H.setScaleY(Utilities.clamp(jVar3.f45087n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar3.f45083j0));
                    jVar3.H.setAlpha(Math.max(0.0f, jVar3.f45087n0 - 0.8f) * jVar3.f45083j0 * 5.0f);
                    return;
                }
                return;
            case 3:
                this.f45020b.k();
                return;
            case 4:
                this.f45020b.k();
                return;
            default:
                j jVar4 = this.f45020b;
                float lerpAngle = AndroidUtilities.lerpAngle(jVar4.f45082i0, jVar4.L, valueAnimator.getAnimatedFraction());
                jVar4.O = lerpAngle;
                jVar4.g(lerpAngle);
                return;
        }
    }
}
