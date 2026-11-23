package x1;

import android.view.animation.Interpolator;
import com.google.android.gms.internal.vision.e2;
public abstract class b implements Interpolator {
    public final float[] f60067a;
    public final float f60068b;

    public b(float[] fArr) {
        this.f60067a = fArr;
        this.f60068b = 1.0f / (fArr.length - 1);
    }

    @Override
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f60067a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f60068b;
        float w10 = e2.w(min, f11, f10, f11);
        float f12 = fArr[min];
        return e2.z(fArr[min + 1], f12, w10, f12);
    }
}
