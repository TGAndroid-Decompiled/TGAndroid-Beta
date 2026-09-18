package r0;

import android.os.Build;
import android.view.animation.Interpolator;
public final class w0 {
    public v0 f42133a;

    public w0(int i10, long j3, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f42133a = new u0(r0.b(i10, j3, interpolator));
        } else {
            this.f42133a = new v0(i10, j3, interpolator);
        }
    }
}
