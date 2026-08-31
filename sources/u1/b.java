package u1;

import android.view.animation.Interpolator;
import e2.c;
public abstract class b implements Interpolator {
    public final float[] f48227a;
    public final float f48228b;

    public b(float[] fArr) {
        this.f48227a = fArr;
        this.f48228b = 1.0f / (fArr.length - 1);
    }

    @Override
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f48227a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f48228b;
        float d = c.d(min, f11, f10, f11);
        float f12 = fArr[min];
        return c.w(fArr[min + 1], f12, d, f12);
    }
}
