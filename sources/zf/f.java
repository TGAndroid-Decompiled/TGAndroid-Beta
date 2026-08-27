package zf;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class f implements ValueAnimator.AnimatorUpdateListener {

    public final int f50403a;

    public final j f50404b;

    public f(j jVar, int i10) {
        this.f50403a = i10;
        this.f50404b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50403a) {
            case 0:
                j jVar = this.f50404b;
                jVar.g(AndroidUtilities.lerpAngle(jVar.H, jVar.f50455e0, jVar.M.getAnimatedFraction()));
                break;
            case 1:
                j jVar2 = this.f50404b;
                jVar2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar2.f50461j0 = fFloatValue;
                jVar2.setAlpha(fFloatValue);
                i iVar = jVar2.D;
                if (iVar != null) {
                    iVar.setScaleX(Utilities.clamp(jVar2.f50461j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.f50457f0));
                    jVar2.D.setScaleY(Utilities.clamp(jVar2.f50461j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.f50457f0));
                    jVar2.D.setAlpha(Math.max(0.0f, jVar2.f50461j0 - 0.8f) * jVar2.f50457f0 * 5.0f);
                }
                jVar2.invalidate();
                break;
            case 2:
                j jVar3 = this.f50404b;
                jVar3.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar3.f50457f0 = fFloatValue2;
                i iVar2 = jVar3.D;
                if (iVar2 != null) {
                    iVar2.setScaleX(Utilities.clamp(jVar3.f50461j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, fFloatValue2));
                    jVar3.D.setScaleY(Utilities.clamp(jVar3.f50461j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar3.f50457f0));
                    jVar3.D.setAlpha(Math.max(0.0f, jVar3.f50461j0 - 0.8f) * jVar3.f50457f0 * 5.0f);
                }
                break;
            case 3:
                this.f50404b.k();
                break;
            case 4:
                this.f50404b.k();
                break;
            default:
                j jVar4 = this.f50404b;
                float fLerpAngle = AndroidUtilities.lerpAngle(jVar4.f50455e0, jVar4.H, valueAnimator.getAnimatedFraction());
                jVar4.K = fLerpAngle;
                jVar4.g(fLerpAngle);
                break;
        }
    }
}
