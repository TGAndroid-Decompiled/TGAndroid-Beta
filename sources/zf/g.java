package zf;

import android.animation.ValueAnimator;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f51170a;
    public final n f51171b;
    public final float f51172c;
    public final float[] d;
    public final float f51173e;
    public final float f51174f;

    public g(n nVar, float f10, float[] fArr, float f11, float f12, int i10) {
        this.f51170a = i10;
        this.f51171b = nVar;
        this.f51172c = f10;
        this.d = fArr;
        this.f51173e = f11;
        this.f51174f = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51170a) {
            case 0:
                n nVar = this.f51171b;
                nVar.getClass();
                float w10 = e2.c.w(this.f51172c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f10 = fArr[0];
                float f11 = w10 / f10;
                fArr[0] = f10 * f11;
                l.g(nVar.I, f11, this.f51173e, this.f51174f);
                nVar.r(false);
                return;
            default:
                n nVar2 = this.f51171b;
                nVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr2 = this.d;
                float f12 = fArr2[1];
                float f13 = (this.f51172c * floatValue) - f12;
                fArr2[1] = f12 + f13;
                float f14 = fArr2[2];
                float f15 = (this.f51173e * floatValue) - f14;
                fArr2[2] = f14 + f15;
                l lVar = nVar2.I;
                float f16 = fArr2[0];
                l.f(lVar, f13 * f16, f15 * f16);
                float f17 = fArr2[0];
                float f18 = (((this.f51174f - 1.0f) * floatValue) + 1.0f) / f17;
                fArr2[0] = f17 * f18;
                l.g(nVar2.I, f18, 0.0f, 0.0f);
                nVar2.r(false);
                return;
        }
    }
}
