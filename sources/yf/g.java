package yf;

import android.animation.ValueAnimator;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f47219a;
    public final n f47220b;
    public final float f47221c;
    public final float[] d;
    public final float e;
    public final float f47222f;

    public g(n nVar, float f10, float[] fArr, float f11, float f12, int i10) {
        this.f47219a = i10;
        this.f47220b = nVar;
        this.f47221c = f10;
        this.d = fArr;
        this.e = f11;
        this.f47222f = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47219a) {
            case 0:
                n nVar = this.f47220b;
                nVar.getClass();
                float w10 = e2.c.w(this.f47221c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f10 = fArr[0];
                float f11 = w10 / f10;
                fArr[0] = f10 * f11;
                l.g(nVar.I, f11, this.e, this.f47222f);
                nVar.r(false);
                return;
            default:
                n nVar2 = this.f47220b;
                nVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr2 = this.d;
                float f12 = fArr2[1];
                float f13 = (this.f47221c * floatValue) - f12;
                fArr2[1] = f12 + f13;
                float f14 = fArr2[2];
                float f15 = (this.e * floatValue) - f14;
                fArr2[2] = f14 + f15;
                l lVar = nVar2.I;
                float f16 = fArr2[0];
                l.f(lVar, f13 * f16, f15 * f16);
                float f17 = fArr2[0];
                float f18 = (((this.f47222f - 1.0f) * floatValue) + 1.0f) / f17;
                fArr2[0] = f17 * f18;
                l.g(nVar2.I, f18, 0.0f, 0.0f);
                nVar2.r(false);
                return;
        }
    }
}
