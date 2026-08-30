package ph;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
public final class n extends y5 {
    public final p C;

    public n(p pVar, Context context) {
        super(context);
        this.C = pVar;
    }

    @Override
    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f42621c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.f42619a.getCameraSessionRecording(), false, false);
        }
        p pVar = this.C;
        if (pVar.L1) {
            pVar.z(true, false);
        }
    }
}
