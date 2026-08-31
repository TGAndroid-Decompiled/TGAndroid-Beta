package qh;

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
import org.telegram.ui.mg1;
public final class n5 {
    public final h8 f45770c;
    public l5 d;
    public CameraView f45772f;
    public Bitmap f45773g;
    public final AtomicReference f45768a = new AtomicReference();
    public final AtomicBoolean f45769b = new AtomicBoolean(false);
    public final k5 h = new k5(this, 0);
    public final String f45771e = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public n5(Context context, h8 h8Var) {
        this.f45770c = h8Var;
        Utilities.globalQueue.postRunnable(new mg1(26, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f45772f = cameraView;
        if (this.f45768a.get() != null && !this.f45769b.get()) {
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
        if (this.f45769b.getAndSet(z4) != z4) {
            if (z4) {
                Utilities.globalQueue.cancelRunnable(this.h);
                if (this.d != null) {
                    this.d = null;
                    AndroidUtilities.runOnUIThread(new k5(this, 1));
                    return;
                }
                return;
            }
            Utilities.globalQueue.cancelRunnable(this.h);
            Utilities.globalQueue.postRunnable(this.h, b());
        }
    }
}
