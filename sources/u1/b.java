package u1;

import android.view.animation.Interpolator;
import e2.c;
public abstract class b implements Interpolator {
    public final float[] f47960a;
    public final float f47961b;

    public b(float[] fArr) {
        this.f47960a = fArr;
        this.f47961b = 1.0f / (fArr.length - 1);
    }

    @Override
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f47960a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f47961b;
        float d = c.d(min, f11, f10, f11);
        float f12 = fArr[min];
        return c.z(fArr[min + 1], f12, d, f12);
    }
}
