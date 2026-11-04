package pg;

import android.animation.ValueAnimator;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f53482a;
    public final m f53483b;
    public final float f53484c;
    public final float[] d;
    public final float f53485e;
    public final float f53486f;

    public g(m mVar, float f10, float[] fArr, float f11, float f12, int i3) {
        this.f53482a = i3;
        this.f53483b = mVar;
        this.f53484c = f10;
        this.d = fArr;
        this.f53485e = f11;
        this.f53486f = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53482a) {
            case 0:
                m mVar = this.f53483b;
                mVar.getClass();
                float y9 = com.google.android.recaptcha.internal.a.y(this.f53484c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f10 = fArr[0];
                float f11 = y9 / f10;
                fArr[0] = f10 * f11;
                k.g(mVar.M, f11, this.f53485e, this.f53486f);
                mVar.r(false);
                return;
            default:
                m mVar2 = this.f53483b;
                mVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr2 = this.d;
                float f12 = fArr2[1];
                float f13 = (this.f53484c * floatValue) - f12;
                fArr2[1] = f12 + f13;
                float f14 = fArr2[2];
                float f15 = (this.f53485e * floatValue) - f14;
                fArr2[2] = f14 + f15;
                k kVar = mVar2.M;
                float f16 = fArr2[0];
                k.f(kVar, f13 * f16, f15 * f16);
                float f17 = fArr2[0];
                float f18 = (((this.f53486f - 1.0f) * floatValue) + 1.0f) / f17;
                fArr2[0] = f17 * f18;
                k.g(mVar2.M, f18, 0.0f, 0.0f);
                mVar2.r(false);
                return;
        }
    }
}
