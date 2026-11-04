package w1;

import android.view.animation.Interpolator;
public abstract class b implements Interpolator {
    public final float[] f57015a;
    public final float f57016b;

    public b(float[] fArr) {
        this.f57015a = fArr;
        this.f57016b = 1.0f / (fArr.length - 1);
    }

    @Override
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f57015a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f57016b;
        float c2 = com.google.android.recaptcha.internal.a.c(min, f11, f10, f11);
        float f12 = fArr[min];
        return com.google.android.recaptcha.internal.a.y(fArr[min + 1], f12, c2, f12);
    }
}
