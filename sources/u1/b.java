package u1;

import android.view.animation.Interpolator;
import com.google.android.gms.internal.vision.e2;
public abstract class b implements Interpolator {
    public final float[] f46602a;
    public final float f46603b;

    public b(float[] fArr) {
        this.f46602a = fArr;
        this.f46603b = 1.0f / (fArr.length - 1);
    }

    @Override
    public final float getInterpolation(float f7) {
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f46602a;
        int min = Math.min((int) ((fArr.length - 1) * f7), fArr.length - 2);
        float f10 = this.f46603b;
        float v = e2.v(min, f10, f7, f10);
        float f11 = fArr[min];
        return e2.z(fArr[min + 1], f11, v, f11);
    }
}
