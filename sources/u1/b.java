package u1;

import android.view.animation.Interpolator;
public abstract class b implements Interpolator {
    public final float[] f48958a;
    public final float f48959b;

    public b(float[] fArr) {
        this.f48958a = fArr;
        this.f48959b = 1.0f / (fArr.length - 1);
    }

    @Override
    public final float getInterpolation(float f9) {
        if (f9 >= 1.0f) {
            return 1.0f;
        }
        if (f9 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f48958a;
        int min = Math.min((int) ((fArr.length - 1) * f9), fArr.length - 2);
        float f10 = this.f48959b;
        float w10 = com.google.android.recaptcha.internal.a.w(min, f10, f9, f10);
        float f11 = fArr[min];
        return com.google.android.recaptcha.internal.a.z(fArr[min + 1], f11, w10, f11);
    }
}
