package r0;

import android.os.Build;
import android.view.animation.Interpolator;
public final class v0 {
    public u0 f54138a;

    public v0(int i7, long j3, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f54138a = new t0(r0.b(i7, j3, interpolator));
        } else {
            this.f54138a = new u0(i7, j3, interpolator);
        }
    }
}
