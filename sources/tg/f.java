package tg;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final int f57226a;
    public final j f57227b;

    public f(j jVar, int i7) {
        this.f57226a = i7;
        this.f57227b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f57226a) {
            case 0:
                j jVar = this.f57227b;
                jVar.g(org.telegram.messenger.g0.b2(jVar.M, jVar.f57383j0, jVar.R.getAnimatedFraction()));
                return;
            case 1:
                j jVar2 = this.f57227b;
                jVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar2.f57388o0 = floatValue;
                jVar2.setAlpha(floatValue);
                i iVar = jVar2.I;
                if (iVar != null) {
                    iVar.setScaleX(Utilities.i(jVar2.f57388o0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, jVar2.f57384k0));
                    jVar2.I.setScaleY(Utilities.i(jVar2.f57388o0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, jVar2.f57384k0));
                    jVar2.I.setAlpha(Math.max(0.0f, jVar2.f57388o0 - 0.8f) * jVar2.f57384k0 * 5.0f);
                }
                jVar2.invalidate();
                return;
            case 2:
                j jVar3 = this.f57227b;
                jVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar3.f57384k0 = floatValue2;
                i iVar2 = jVar3.I;
                if (iVar2 != null) {
                    iVar2.setScaleX(Utilities.i(jVar3.f57388o0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, floatValue2));
                    jVar3.I.setScaleY(Utilities.i(jVar3.f57388o0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, jVar3.f57384k0));
                    jVar3.I.setAlpha(Math.max(0.0f, jVar3.f57388o0 - 0.8f) * jVar3.f57384k0 * 5.0f);
                    return;
                }
                return;
            case 3:
                this.f57227b.k();
                return;
            case 4:
                this.f57227b.k();
                return;
            default:
                j jVar4 = this.f57227b;
                float b22 = org.telegram.messenger.g0.b2(jVar4.f57383j0, jVar4.M, valueAnimator.getAnimatedFraction());
                jVar4.P = b22;
                jVar4.g(b22);
                return;
        }
    }
}
