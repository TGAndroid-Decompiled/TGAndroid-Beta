package qh;

import org.telegram.messenger.camera.CameraController;
public final class v8 implements Runnable {
    public final int f46221a;
    public final x8 f46222b;

    public v8(x8 x8Var, int i10) {
        this.f46221a = i10;
        this.f46222b = x8Var;
    }

    @Override
    public final void run() {
        switch (this.f46221a) {
            case 0:
                ba baVar = this.f46222b.f46318a;
                m5 m5Var = baVar.f45123z0;
                if (m5Var != null) {
                    m5Var.c(false);
                }
                if (baVar.N1 && baVar.O1 && baVar.f45120y0 != null) {
                    baVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(baVar.f45120y0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f46222b.f46318a.K(1, true);
                return;
            case 2:
                this.f46222b.f46318a.K(1, true);
                return;
            default:
                this.f46222b.f46318a.K(1, true);
                return;
        }
    }
}
