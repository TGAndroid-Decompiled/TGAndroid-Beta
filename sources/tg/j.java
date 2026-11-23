package tg;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f57986a;
    public final n f57987b;

    public j(n nVar, int i7) {
        this.f57986a = i7;
        this.f57987b = nVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f57986a) {
            case 0:
                n nVar = this.f57987b;
                nVar.g(org.telegram.messenger.g0.b2(nVar.N, nVar.f58102k0, nVar.S.getAnimatedFraction()));
                return;
            case 1:
                n nVar2 = this.f57987b;
                nVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar2.f58107p0 = floatValue;
                nVar2.setAlpha(floatValue);
                m mVar = nVar2.J;
                if (mVar != null) {
                    mVar.setScaleX(Utilities.i(nVar2.f58107p0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, nVar2.f58103l0));
                    nVar2.J.setScaleY(Utilities.i(nVar2.f58107p0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, nVar2.f58103l0));
                    nVar2.J.setAlpha(Math.max(0.0f, nVar2.f58107p0 - 0.8f) * nVar2.f58103l0 * 5.0f);
                }
                nVar2.invalidate();
                return;
            case 2:
                n nVar3 = this.f57987b;
                nVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar3.f58103l0 = floatValue2;
                m mVar2 = nVar3.J;
                if (mVar2 != null) {
                    mVar2.setScaleX(Utilities.i(nVar3.f58107p0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, floatValue2));
                    nVar3.J.setScaleY(Utilities.i(nVar3.f58107p0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, nVar3.f58103l0));
                    nVar3.J.setAlpha(Math.max(0.0f, nVar3.f58107p0 - 0.8f) * nVar3.f58103l0 * 5.0f);
                    return;
                }
                return;
            case 3:
                this.f57987b.k();
                return;
            case 4:
                this.f57987b.k();
                return;
            default:
                n nVar4 = this.f57987b;
                float b22 = org.telegram.messenger.g0.b2(nVar4.f58102k0, nVar4.N, valueAnimator.getAnimatedFraction());
                nVar4.Q = b22;
                nVar4.g(b22);
                return;
        }
    }
}
