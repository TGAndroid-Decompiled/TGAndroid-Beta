package ph;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.sg1;
public final class o5 {
    public final h8 f42097c;
    public m5 d;
    public CameraView f42098f;
    public Bitmap f42099g;
    public final AtomicReference f42095a = new AtomicReference();
    public final AtomicBoolean f42096b = new AtomicBoolean(false);
    public final l5 h = new l5(this, 0);
    public final String e = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public o5(Context context, h8 h8Var) {
        this.f42097c = h8Var;
        Utilities.globalQueue.postRunnable(new sg1(26, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f42098f = cameraView;
        if (this.f42095a.get() != null && !this.f42096b.get()) {
            Utilities.globalQueue.cancelRunnable(this.h);
            Utilities.globalQueue.postRunnable(this.h, b());
        }
    }

    public final long b() {
        if (this.d == null) {
            return 750L;
        }
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            if (devicePerformanceClass != 2) {
                return 800L;
            }
            return 80L;
        }
        return 400L;
    }

    public final void c(boolean z4) {
        if (this.f42096b.getAndSet(z4) != z4) {
            if (z4) {
                Utilities.globalQueue.cancelRunnable(this.h);
                if (this.d != null) {
                    this.d = null;
                    AndroidUtilities.runOnUIThread(new l5(this, 1));
                    return;
                }
                return;
            }
            Utilities.globalQueue.cancelRunnable(this.h);
            Utilities.globalQueue.postRunnable(this.h, b());
        }
    }
}
