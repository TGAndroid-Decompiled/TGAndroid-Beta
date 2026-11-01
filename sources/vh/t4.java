package vh;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.jo;
public final class t4 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final v4 f51980a;

    public t4(v4 v4Var) {
        this.f51980a = v4Var;
    }

    @Override
    public void onCameraInit() {
        v4 v4Var = this.f51980a;
        u4 u4Var = v4Var.f52058a;
        if (v4Var.f52060c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(u4Var.getCameraSessionObject(), v4Var.f52059b, false, new t4(v4Var), new s4(v4Var, 1), u4Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        v4 v4Var = this.f51980a;
        v4Var.d = currentTimeMillis;
        org.telegram.messenger.i0.r(v4Var.h);
        if (!v4Var.f52067y) {
            if (j10 > 1000) {
                v4Var.f52058a.destroy(true, null);
                jo joVar = v4Var.f52062n;
                if (joVar != null) {
                    joVar.a(v4Var.f52059b, str, Long.valueOf(j10));
                    return;
                }
                return;
            }
            v4Var.a(false);
        }
    }
}
