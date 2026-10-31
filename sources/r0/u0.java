package r0;

import android.os.Build;
import android.view.animation.Interpolator;
public final class u0 {
    public t0 f46156a;

    public u0(int i10, long j10, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f46156a = new s0(q0.b(i10, j10, interpolator));
        } else {
            this.f46156a = new t0(i10, j10, interpolator);
        }
    }
}
