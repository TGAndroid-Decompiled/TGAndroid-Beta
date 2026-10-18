package r0;

import android.os.Build;
import android.view.animation.Interpolator;
public final class v0 {
    public u0 f44897a;

    public v0(int i10, long j10, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f44897a = new t0(r0.b(i10, j10, interpolator));
        } else {
            this.f44897a = new u0(i10, j10, interpolator);
        }
    }
}
