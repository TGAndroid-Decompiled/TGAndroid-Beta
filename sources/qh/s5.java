package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class s5 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final v5 f46098a;

    public s5(v5 v5Var) {
        this.f46098a = v5Var;
    }

    @Override
    public void onCameraInit() {
        v5 v5Var = this.f46098a;
        u5 u5Var = v5Var.f46210a;
        if (v5Var.f46212c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(u5Var.getCameraSessionObject(), v5Var.f46211b, false, new s5(v5Var), new r5(v5Var, 1), u5Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        v5 v5Var = this.f46098a;
        v5Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(v5Var.h);
        if (!v5Var.f46219x) {
            if (j10 > 1000) {
                v5Var.f46210a.destroy(true, null);
                oh.z zVar = v5Var.f46215n;
                if (zVar != null) {
                    zVar.run(v5Var.f46211b, str, Long.valueOf(j10));
                    return;
                }
                return;
            }
            v5Var.a(false);
        }
    }
}
