package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class u5 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final x5 f42477a;

    public u5(x5 x5Var) {
        this.f42477a = x5Var;
    }

    @Override
    public void onCameraInit() {
        x5 x5Var = this.f42477a;
        w5 w5Var = x5Var.f42592a;
        if (x5Var.f42594c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(w5Var.getCameraSessionObject(), x5Var.f42593b, false, new u5(x5Var), new t5(x5Var, 1), w5Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        x5 x5Var = this.f42477a;
        x5Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(x5Var.h);
        if (!x5Var.f42600x) {
            if (j10 > 1000) {
                x5Var.f42592a.destroy(true, null);
                nh.a0 a0Var = x5Var.f42596n;
                if (a0Var != null) {
                    a0Var.run(x5Var.f42593b, str, Long.valueOf(j10));
                    return;
                }
                return;
            }
            x5Var.a(false);
        }
    }
}
