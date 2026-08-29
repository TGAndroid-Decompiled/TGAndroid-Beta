package wf;

import android.animation.ValueAnimator;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f49922a;
    public final n f49923b;
    public final float f49924c;
    public final float[] d;
    public final float f49925e;
    public final float f49926f;

    public g(n nVar, float f9, float[] fArr, float f10, float f11, int i10) {
        this.f49922a = i10;
        this.f49923b = nVar;
        this.f49924c = f9;
        this.d = fArr;
        this.f49925e = f10;
        this.f49926f = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49922a) {
            case 0:
                n nVar = this.f49923b;
                nVar.getClass();
                float z10 = com.google.android.recaptcha.internal.a.z(this.f49924c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f9 = fArr[0];
                float f10 = z10 / f9;
                fArr[0] = f9 * f10;
                l.g(nVar.H, f10, this.f49925e, this.f49926f);
                nVar.r(false);
                return;
            default:
                n nVar2 = this.f49923b;
                nVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr2 = this.d;
                float f11 = fArr2[1];
                float f12 = (this.f49924c * floatValue) - f11;
                fArr2[1] = f11 + f12;
                float f13 = fArr2[2];
                float f14 = (this.f49925e * floatValue) - f13;
                fArr2[2] = f13 + f14;
                l lVar = nVar2.H;
                float f15 = fArr2[0];
                l.f(lVar, f12 * f15, f14 * f15);
                float f16 = fArr2[0];
                float f17 = (((this.f49926f - 1.0f) * floatValue) + 1.0f) / f16;
                fArr2[0] = f16 * f17;
                l.g(nVar2.H, f17, 0.0f, 0.0f);
                nVar2.r(false);
                return;
        }
    }
}
