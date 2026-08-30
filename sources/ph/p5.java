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
import org.telegram.ui.kg1;
public final class p5 {
    public final i8 f42163c;
    public n5 d;
    public CameraView f42164f;
    public Bitmap f42165g;
    public final AtomicReference f42161a = new AtomicReference();
    public final AtomicBoolean f42162b = new AtomicBoolean(false);
    public final m5 h = new m5(this, 0);
    public final String e = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public p5(Context context, i8 i8Var) {
        this.f42163c = i8Var;
        Utilities.globalQueue.postRunnable(new kg1(26, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f42164f = cameraView;
        if (this.f42161a.get() != null && !this.f42162b.get()) {
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
        if (this.f42162b.getAndSet(z4) != z4) {
            if (z4) {
                Utilities.globalQueue.cancelRunnable(this.h);
                if (this.d != null) {
                    this.d = null;
                    AndroidUtilities.runOnUIThread(new m5(this, 1));
                    return;
                }
                return;
            }
            Utilities.globalQueue.cancelRunnable(this.h);
            Utilities.globalQueue.postRunnable(this.h, b());
        }
    }
}
