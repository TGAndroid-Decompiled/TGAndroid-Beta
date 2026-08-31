package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class t5 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final w5 f46118a;

    public t5(w5 w5Var) {
        this.f46118a = w5Var;
    }

    @Override
    public void onCameraInit() {
        w5 w5Var = this.f46118a;
        v5 v5Var = w5Var.f46227a;
        if (w5Var.f46229c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(v5Var.getCameraSessionObject(), w5Var.f46228b, false, new t5(w5Var), new s5(w5Var, 1), v5Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        w5 w5Var = this.f46118a;
        w5Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(w5Var.h);
        if (!w5Var.f46236x) {
            if (j10 > 1000) {
                w5Var.f46227a.destroy(true, null);
                oh.z zVar = w5Var.f46232n;
                if (zVar != null) {
                    zVar.run(w5Var.f46228b, str, Long.valueOf(j10));
                    return;
                }
                return;
            }
            w5Var.a(false);
        }
    }
}
