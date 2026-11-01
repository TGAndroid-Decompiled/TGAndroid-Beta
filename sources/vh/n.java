package vh;

import android.content.Context;
import org.telegram.messenger.camera.CameraController;
public final class n extends v4 {
    public final p F;

    public n(p pVar, Context context) {
        super(context);
        this.F = pVar;
    }

    @Override
    public final void c() {
        org.telegram.messenger.i0.r(this.h);
        if (this.f52060c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.f52058a.getCameraSessionRecording(), false, false);
        }
        p pVar = this.F;
        if (pVar.N1) {
            pVar.z(true, false);
        }
    }
}
