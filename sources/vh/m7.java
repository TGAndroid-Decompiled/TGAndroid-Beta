package vh;

import org.telegram.messenger.camera.CameraController;
public final class m7 implements Runnable {
    public final int f51501a;
    public final o7 f51502b;

    public m7(o7 o7Var, int i10) {
        this.f51501a = i10;
        this.f51502b = o7Var;
    }

    @Override
    public final void run() {
        switch (this.f51501a) {
            case 0:
                o8 o8Var = this.f51502b.f51618a;
                o4 o4Var = o8Var.C0;
                if (o4Var != null) {
                    o4Var.c(false);
                }
                if (o8Var.Q1 && o8Var.R1 && o8Var.B0 != null) {
                    o8Var.i0(false);
                    CameraController.getInstance().stopVideoRecording(o8Var.B0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f51502b.f51618a.J(1, true);
                return;
            case 2:
                this.f51502b.f51618a.J(1, true);
                return;
            default:
                this.f51502b.f51618a.J(1, true);
                return;
        }
    }
}
