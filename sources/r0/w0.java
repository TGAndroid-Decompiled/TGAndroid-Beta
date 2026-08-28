package r0;

import android.os.Build;
import android.view.animation.Interpolator;
public final class w0 {
    public v0 f46956a;

    public w0(int i9, long j10, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f46956a = new u0(s0.b(i9, j10, interpolator));
        } else {
            this.f46956a = new v0(i9, j10, interpolator);
        }
    }
}
