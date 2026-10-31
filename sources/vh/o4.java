package vh;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.d20;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
public final class o4 {
    public final z6 f51596c;
    public m4 d;
    public CameraView f51597f;
    public Bitmap f51598g;
    public final AtomicReference f51594a = new AtomicReference();
    public final AtomicBoolean f51595b = new AtomicBoolean(false);
    public final l4 h = new l4(this, 0);
    public final String e = vp.r1(d20.f15147s0).U2;

    public o4(Context context, z6 z6Var) {
        this.f51596c = z6Var;
        Utilities.e.c(new d1(7, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f51597f = cameraView;
        if (this.f51594a.get() != null && !this.f51595b.get()) {
            Utilities.e.a(this.h);
            Utilities.e.d(this.h, b());
        }
    }

    public final long b() {
        if (this.d == null) {
            return 750L;
        }
        int o10 = tz.o();
        if (o10 != 1) {
            if (o10 != 2) {
                return 800L;
            }
            return 80L;
        }
        return 400L;
    }

    public final void c(boolean z10) {
        if (this.f51595b.getAndSet(z10) != z10) {
            if (z10) {
                Utilities.e.a(this.h);
                if (this.d != null) {
                    this.d = null;
                    org.telegram.messenger.i0.g3(new l4(this, 1));
                    return;
                }
                return;
            }
            Utilities.e.a(this.h);
            Utilities.e.d(this.h, b());
        }
    }
}
