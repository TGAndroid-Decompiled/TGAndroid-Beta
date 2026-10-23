package u1;

import android.view.animation.Interpolator;
import com.google.android.gms.internal.play_billing.k3;
public abstract class b implements Interpolator {
    public final float[] f47687a;
    public final float f47688b;

    public b(float[] fArr) {
        this.f47687a = fArr;
        this.f47688b = 1.0f / (fArr.length - 1);
    }

    @Override
    public final float getInterpolation(float f7) {
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f47687a;
        int min = Math.min((int) ((fArr.length - 1) * f7), fArr.length - 2);
        float f10 = this.f47688b;
        float c10 = k3.c(min, f10, f7, f10);
        float f11 = fArr[min];
        return k3.y(fArr[min + 1], f11, c10, f11);
    }
}
