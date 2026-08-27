package r0;

import android.os.Build;
import android.view.animation.Interpolator;

public final class w0 {

    public v0 f46646a;

    public w0(int i10, long j10, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f46646a = new u0(s0.b(i10, j10, interpolator));
        } else {
            this.f46646a = new r0(i10, j10, interpolator);
        }
    }
}
