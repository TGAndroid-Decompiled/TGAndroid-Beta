package ph;

import org.telegram.messenger.camera.CameraController;
public final class y8 implements Runnable {
    public final int f42629a;
    public final a9 f42630b;

    public y8(a9 a9Var, int i10) {
        this.f42629a = i10;
        this.f42630b = a9Var;
    }

    @Override
    public final void run() {
        switch (this.f42629a) {
            case 0:
                da daVar = this.f42630b.f41281a;
                p5 p5Var = daVar.f41554z0;
                if (p5Var != null) {
                    p5Var.c(false);
                }
                if (daVar.N1 && daVar.O1 && daVar.f41551y0 != null) {
                    daVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(daVar.f41551y0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f42630b.f41281a.K(1, true);
                return;
            case 2:
                this.f42630b.f41281a.K(1, true);
                return;
            default:
                this.f42630b.f41281a.K(1, true);
                return;
        }
    }
}
