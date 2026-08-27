package u1;

import android.view.animation.Interpolator;

public abstract class b implements Interpolator {

    public final float[] f48254a;

    public final float f48255b;

    public b(float[] fArr) {
        this.f48254a = fArr;
        this.f48255b = 1.0f / (fArr.length - 1);
    }

    @Override
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f48254a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f48255b;
        float fW = com.google.android.recaptcha.internal.a.w(iMin, f11, f10, f11);
        float f12 = fArr[iMin];
        return com.google.android.recaptcha.internal.a.z(fArr[iMin + 1], f12, fW, f12);
    }
}
