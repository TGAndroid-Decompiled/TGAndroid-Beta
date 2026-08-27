package uf;

import android.animation.ValueAnimator;

public final class g implements ValueAnimator.AnimatorUpdateListener {

    public final int f48595a;

    public final n f48596b;

    public final float f48597c;
    public final float[] d;

    public final float f48598e;

    public final float f48599f;

    public g(n nVar, float f10, float[] fArr, float f11, float f12, int i10) {
        this.f48595a = i10;
        this.f48596b = nVar;
        this.f48597c = f10;
        this.d = fArr;
        this.f48598e = f11;
        this.f48599f = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48595a) {
            case 0:
                n nVar = this.f48596b;
                nVar.getClass();
                float fZ = com.google.android.recaptcha.internal.a.z(this.f48597c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f10 = fArr[0];
                float f11 = fZ / f10;
                fArr[0] = f10 * f11;
                l.g(nVar.H, f11, this.f48598e, this.f48599f);
                nVar.r(false);
                break;
            default:
                n nVar2 = this.f48596b;
                nVar2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.f48597c * fFloatValue;
                float[] fArr2 = this.d;
                float f13 = fArr2[1];
                float f14 = f12 - f13;
                fArr2[1] = f13 + f14;
                float f15 = this.f48598e * fFloatValue;
                float f16 = fArr2[2];
                float f17 = f15 - f16;
                fArr2[2] = f16 + f17;
                l lVar = nVar2.H;
                float f18 = fArr2[0];
                l.f(lVar, f14 * f18, f17 * f18);
                float f19 = ((this.f48599f - 1.0f) * fFloatValue) + 1.0f;
                float f20 = fArr2[0];
                float f21 = f19 / f20;
                fArr2[0] = f20 * f21;
                l.g(nVar2.H, f21, 0.0f, 0.0f);
                nVar2.r(false);
                break;
        }
    }
}
