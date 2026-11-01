package vh;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.e20;
import org.telegram.messenger.uz;
import org.telegram.messenger.wp;
public final class o4 {
    public final z6 f51611c;
    public m4 d;
    public CameraView f51612f;
    public Bitmap f51613g;
    public final AtomicReference f51609a = new AtomicReference();
    public final AtomicBoolean f51610b = new AtomicBoolean(false);
    public final l4 h = new l4(this, 0);
    public final String e = wp.r1(e20.f15506s0).U2;

    public o4(Context context, z6 z6Var) {
        this.f51611c = z6Var;
        Utilities.e.c(new r0(8, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f51612f = cameraView;
        if (this.f51609a.get() != null && !this.f51610b.get()) {
            Utilities.e.a(this.h);
            Utilities.e.d(this.h, b());
        }
    }

    public final long b() {
        if (this.d == null) {
            return 750L;
        }
        int o10 = uz.o();
        if (o10 != 1) {
            if (o10 != 2) {
                return 800L;
            }
            return 80L;
        }
        return 400L;
    }

    public final void c(boolean z10) {
        if (this.f51610b.getAndSet(z10) != z10) {
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
