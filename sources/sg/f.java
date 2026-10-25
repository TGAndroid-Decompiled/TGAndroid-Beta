package sg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final int f48197a;
    public final j f48198b;

    public f(j jVar, int i10) {
        this.f48197a = i10;
        this.f48198b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48197a) {
            case 0:
                j jVar = this.f48198b;
                jVar.g(AndroidUtilities.lerpAngle(jVar.L, jVar.f48252i0, jVar.Q.getAnimatedFraction()));
                return;
            case 1:
                j jVar2 = this.f48198b;
                jVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar2.f48257n0 = floatValue;
                jVar2.setAlpha(floatValue);
                i iVar = jVar2.H;
                if (iVar != null) {
                    iVar.setScaleX(Utilities.clamp(jVar2.f48257n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.f48253j0));
                    jVar2.H.setScaleY(Utilities.clamp(jVar2.f48257n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.f48253j0));
                    jVar2.H.setAlpha(Math.max(0.0f, jVar2.f48257n0 - 0.8f) * jVar2.f48253j0 * 5.0f);
                }
                jVar2.invalidate();
                return;
            case 2:
                j jVar3 = this.f48198b;
                jVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar3.f48253j0 = floatValue2;
                i iVar2 = jVar3.H;
                if (iVar2 != null) {
                    iVar2.setScaleX(Utilities.clamp(jVar3.f48257n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, floatValue2));
                    jVar3.H.setScaleY(Utilities.clamp(jVar3.f48257n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar3.f48253j0));
                    jVar3.H.setAlpha(Math.max(0.0f, jVar3.f48257n0 - 0.8f) * jVar3.f48253j0 * 5.0f);
                    return;
                }
                return;
            case 3:
                this.f48198b.k();
                return;
            case 4:
                this.f48198b.k();
                return;
            default:
                j jVar4 = this.f48198b;
                float lerpAngle = AndroidUtilities.lerpAngle(jVar4.f48252i0, jVar4.L, valueAnimator.getAnimatedFraction());
                jVar4.O = lerpAngle;
                jVar4.g(lerpAngle);
                return;
        }
    }
}
