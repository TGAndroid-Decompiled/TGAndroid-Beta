package u1;

import android.view.animation.Interpolator;
import c3.h0;
public abstract class b implements Interpolator {
    public final float[] f49272a;
    public final float f49273b;

    public b(float[] fArr) {
        this.f49272a = fArr;
        this.f49273b = 1.0f / (fArr.length - 1);
    }

    @Override
    public final float getInterpolation(float f7) {
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f49272a;
        int min = Math.min((int) ((fArr.length - 1) * f7), fArr.length - 2);
        float f10 = this.f49273b;
        float f11 = h0.f(min, f10, f7, f10);
        float f12 = fArr[min];
        return h0.z(fArr[min + 1], f12, f11, f12);
    }
}
