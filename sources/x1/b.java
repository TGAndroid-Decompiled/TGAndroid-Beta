package x1;

import android.view.animation.Interpolator;
public abstract class b implements Interpolator {
    public final float[] f58173a;
    public final float f58174b;

    public b(float[] fArr) {
        this.f58173a = fArr;
        this.f58174b = 1.0f / (fArr.length - 1);
    }

    @Override
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f58173a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f58174b;
        float w10 = com.google.android.recaptcha.internal.a.w(min, f11, f10, f11);
        float f12 = fArr[min];
        return com.google.android.recaptcha.internal.a.z(fArr[min + 1], f12, w10, f12);
    }
}
