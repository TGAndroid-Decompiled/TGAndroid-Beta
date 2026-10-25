package u1;

import android.view.animation.Interpolator;
import c3.h0;
public abstract class b implements Interpolator {
    public final float[] f49234a;
    public final float f49235b;

    public b(float[] fArr) {
        this.f49234a = fArr;
        this.f49235b = 1.0f / (fArr.length - 1);
    }

    @Override
    public final float getInterpolation(float f7) {
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f49234a;
        int min = Math.min((int) ((fArr.length - 1) * f7), fArr.length - 2);
        float f10 = this.f49235b;
        float f11 = h0.f(min, f10, f7, f10);
        float f12 = fArr[min];
        return h0.z(fArr[min + 1], f12, f11, f12);
    }
}
