package u1;

import android.view.animation.Interpolator;
import c3.i0;
public abstract class b implements Interpolator {
    public final float[] f49829a;
    public final float f49830b;

    public b(float[] fArr) {
        this.f49829a = fArr;
        this.f49830b = 1.0f / (fArr.length - 1);
    }

    @Override
    public final float getInterpolation(float f7) {
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f49829a;
        int min = Math.min((int) ((fArr.length - 1) * f7), fArr.length - 2);
        float f10 = this.f49830b;
        float g10 = i0.g(min, f10, f7, f10);
        float f11 = fArr[min];
        return i0.z(fArr[min + 1], f11, g10, f11);
    }
}
