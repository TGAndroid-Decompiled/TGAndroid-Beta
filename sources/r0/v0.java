package r0;

import android.os.Build;
import android.view.animation.Interpolator;
public final class v0 {
    public u0 f54055a;

    public v0(int i3, long j10, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f54055a = new t0(r0.b(i3, j10, interpolator));
        } else {
            this.f54055a = new u0(i3, j10, interpolator);
        }
    }
}
