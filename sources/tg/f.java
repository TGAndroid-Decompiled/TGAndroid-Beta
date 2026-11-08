package tg;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final int f55650a;
    public final j f55651b;

    public f(j jVar, int i7) {
        this.f55650a = i7;
        this.f55651b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f55650a) {
            case 0:
                j jVar = this.f55651b;
                jVar.g(org.telegram.messenger.g0.b2(jVar.L, jVar.f55781i0, jVar.Q.getAnimatedFraction()));
                return;
            case 1:
                j jVar2 = this.f55651b;
                jVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar2.f55786n0 = floatValue;
                jVar2.setAlpha(floatValue);
                i iVar = jVar2.H;
                if (iVar != null) {
                    iVar.setScaleX(Utilities.i(jVar2.f55786n0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, jVar2.f55782j0));
                    jVar2.H.setScaleY(Utilities.i(jVar2.f55786n0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, jVar2.f55782j0));
                    jVar2.H.setAlpha(Math.max(0.0f, jVar2.f55786n0 - 0.8f) * jVar2.f55782j0 * 5.0f);
                }
                jVar2.invalidate();
                return;
            case 2:
                j jVar3 = this.f55651b;
                jVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar3.f55782j0 = floatValue2;
                i iVar2 = jVar3.H;
                if (iVar2 != null) {
                    iVar2.setScaleX(Utilities.i(jVar3.f55786n0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, floatValue2));
                    jVar3.H.setScaleY(Utilities.i(jVar3.f55786n0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, jVar3.f55782j0));
                    jVar3.H.setAlpha(Math.max(0.0f, jVar3.f55786n0 - 0.8f) * jVar3.f55782j0 * 5.0f);
                    return;
                }
                return;
            case 3:
                this.f55651b.k();
                return;
            case 4:
                this.f55651b.k();
                return;
            default:
                j jVar4 = this.f55651b;
                float b22 = org.telegram.messenger.g0.b2(jVar4.f55781i0, jVar4.L, valueAnimator.getAnimatedFraction());
                jVar4.O = b22;
                jVar4.g(b22);
                return;
        }
    }
}
