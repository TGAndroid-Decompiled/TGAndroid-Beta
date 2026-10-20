package u1;

import android.view.animation.Interpolator;
import com.google.android.gms.internal.play_billing.k3;
public abstract class b implements Interpolator {
    public final float[] f47248a;
    public final float f47249b;

    public b(float[] fArr) {
        this.f47248a = fArr;
        this.f47249b = 1.0f / (fArr.length - 1);
    }

    @Override
    public final float getInterpolation(float f7) {
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f47248a;
        int min = Math.min((int) ((fArr.length - 1) * f7), fArr.length - 2);
        float f10 = this.f47249b;
        float c10 = k3.c(min, f10, f7, f10);
        float f11 = fArr[min];
        return k3.y(fArr[min + 1], f11, c10, f11);
    }
}
