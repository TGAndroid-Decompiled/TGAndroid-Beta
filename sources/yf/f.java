package yf;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final int f49809a;
    public final j f49810b;

    public f(j jVar, int i9) {
        this.f49809a = i9;
        this.f49810b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49809a) {
            case 0:
                j jVar = this.f49810b;
                jVar.g(AndroidUtilities.lerpAngle(jVar.H, jVar.f49858e0, jVar.M.getAnimatedFraction()));
                return;
            case 1:
                j jVar2 = this.f49810b;
                jVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar2.f49864j0 = floatValue;
                jVar2.setAlpha(floatValue);
                i iVar = jVar2.D;
                if (iVar != null) {
                    iVar.setScaleX(Utilities.clamp(jVar2.f49864j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.f49860f0));
                    jVar2.D.setScaleY(Utilities.clamp(jVar2.f49864j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.f49860f0));
                    jVar2.D.setAlpha(Math.max(0.0f, jVar2.f49864j0 - 0.8f) * jVar2.f49860f0 * 5.0f);
                }
                jVar2.invalidate();
                return;
            case 2:
                j jVar3 = this.f49810b;
                jVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar3.f49860f0 = floatValue2;
                i iVar2 = jVar3.D;
                if (iVar2 != null) {
                    iVar2.setScaleX(Utilities.clamp(jVar3.f49864j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, floatValue2));
                    jVar3.D.setScaleY(Utilities.clamp(jVar3.f49864j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar3.f49860f0));
                    jVar3.D.setAlpha(Math.max(0.0f, jVar3.f49864j0 - 0.8f) * jVar3.f49860f0 * 5.0f);
                    return;
                }
                return;
            case 3:
                this.f49810b.k();
                return;
            case 4:
                this.f49810b.k();
                return;
            default:
                j jVar4 = this.f49810b;
                float lerpAngle = AndroidUtilities.lerpAngle(jVar4.f49858e0, jVar4.H, valueAnimator.getAnimatedFraction());
                jVar4.K = lerpAngle;
                jVar4.g(lerpAngle);
                return;
        }
    }
}
