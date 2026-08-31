package qh;

import org.telegram.messenger.camera.CameraController;
public final class w8 implements Runnable {
    public final int f46238a;
    public final y8 f46239b;

    public w8(y8 y8Var, int i10) {
        this.f46238a = i10;
        this.f46239b = y8Var;
    }

    @Override
    public final void run() {
        switch (this.f46238a) {
            case 0:
                ca caVar = this.f46239b.f46362a;
                n5 n5Var = caVar.f45157z0;
                if (n5Var != null) {
                    n5Var.c(false);
                }
                if (caVar.N1 && caVar.O1 && caVar.f45154y0 != null) {
                    caVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(caVar.f45154y0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f46239b.f46362a.K(1, true);
                return;
            case 2:
                this.f46239b.f46362a.K(1, true);
                return;
            default:
                this.f46239b.f46362a.K(1, true);
                return;
        }
    }
}
