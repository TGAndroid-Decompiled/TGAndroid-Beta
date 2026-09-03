package ph;

import org.telegram.messenger.camera.CameraController;
public final class x8 implements Runnable {
    public final int f42602a;
    public final a9 f42603b;

    public x8(a9 a9Var, int i10) {
        this.f42602a = i10;
        this.f42603b = a9Var;
    }

    @Override
    public final void run() {
        switch (this.f42602a) {
            case 0:
                da daVar = this.f42603b.f41310a;
                o5 o5Var = daVar.f41592z0;
                if (o5Var != null) {
                    o5Var.c(false);
                }
                if (daVar.N1 && daVar.O1 && daVar.f41589y0 != null) {
                    daVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(daVar.f41589y0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f42603b.f41310a.K(1, true);
                return;
            case 2:
                this.f42603b.f41310a.K(1, true);
                return;
            default:
                this.f42603b.f41310a.K(1, true);
                return;
        }
    }
}
