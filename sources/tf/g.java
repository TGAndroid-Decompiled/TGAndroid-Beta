package tf;

import android.animation.ValueAnimator;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f47873a;
    public final n f47874b;
    public final float f47875c;
    public final float[] d;
    public final float f47876e;
    public final float f47877f;

    public g(n nVar, float f10, float[] fArr, float f11, float f12, int i9) {
        this.f47873a = i9;
        this.f47874b = nVar;
        this.f47875c = f10;
        this.d = fArr;
        this.f47876e = f11;
        this.f47877f = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47873a) {
            case 0:
                n nVar = this.f47874b;
                nVar.getClass();
                float z10 = e2.c.z(this.f47875c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f10 = fArr[0];
                float f11 = z10 / f10;
                fArr[0] = f10 * f11;
                l.g(nVar.H, f11, this.f47876e, this.f47877f);
                nVar.r(false);
                return;
            default:
                n nVar2 = this.f47874b;
                nVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr2 = this.d;
                float f12 = fArr2[1];
                float f13 = (this.f47875c * floatValue) - f12;
                fArr2[1] = f12 + f13;
                float f14 = fArr2[2];
                float f15 = (this.f47876e * floatValue) - f14;
                fArr2[2] = f14 + f15;
                l lVar = nVar2.H;
                float f16 = fArr2[0];
                l.f(lVar, f13 * f16, f15 * f16);
                float f17 = fArr2[0];
                float f18 = (((this.f47877f - 1.0f) * floatValue) + 1.0f) / f17;
                fArr2[0] = f17 * f18;
                l.g(nVar2.H, f18, 0.0f, 0.0f);
                nVar2.r(false);
                return;
        }
    }
}
