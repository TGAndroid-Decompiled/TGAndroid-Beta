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
import org.telegram.ui.bh1;
public final class m5 {
    public final g8 f45747c;
    public k5 d;
    public CameraView f45749f;
    public Bitmap f45750g;
    public final AtomicReference f45745a = new AtomicReference();
    public final AtomicBoolean f45746b = new AtomicBoolean(false);
    public final j5 h = new j5(this, 0);
    public final String f45748e = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public m5(Context context, g8 g8Var) {
        this.f45747c = g8Var;
        Utilities.globalQueue.postRunnable(new bh1(25, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f45749f = cameraView;
        if (this.f45745a.get() != null && !this.f45746b.get()) {
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
        if (this.f45746b.getAndSet(z4) != z4) {
            if (z4) {
                Utilities.globalQueue.cancelRunnable(this.h);
                if (this.d != null) {
                    this.d = null;
                    AndroidUtilities.runOnUIThread(new j5(this, 1));
                    return;
                }
                return;
            }
            Utilities.globalQueue.cancelRunnable(this.h);
            Utilities.globalQueue.postRunnable(this.h, b());
        }
    }
}
