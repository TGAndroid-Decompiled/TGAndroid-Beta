package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class v5 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final y5 f42479a;

    public v5(y5 y5Var) {
        this.f42479a = y5Var;
    }

    @Override
    public void onCameraInit() {
        y5 y5Var = this.f42479a;
        x5 x5Var = y5Var.f42619a;
        if (y5Var.f42621c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(x5Var.getCameraSessionObject(), y5Var.f42620b, false, new v5(y5Var), new u5(y5Var, 1), x5Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        y5 y5Var = this.f42479a;
        y5Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(y5Var.h);
        if (!y5Var.f42627x) {
            if (j10 > 1000) {
                y5Var.f42619a.destroy(true, null);
                nh.a0 a0Var = y5Var.f42623n;
                if (a0Var != null) {
                    a0Var.run(y5Var.f42620b, str, Long.valueOf(j10));
                    return;
                }
                return;
            }
            y5Var.a(false);
        }
    }
}
