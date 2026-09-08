package r0;

import android.os.Build;
import android.view.animation.Interpolator;
public final class v0 {
    public u0 f44766a;

    public v0(int i10, long j3, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f44766a = new t0(r0.b(i10, j3, interpolator));
        } else {
            this.f44766a = new u0(i10, j3, interpolator);
        }
    }
}
