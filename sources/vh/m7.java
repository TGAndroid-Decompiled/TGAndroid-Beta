package vh;

import org.telegram.messenger.camera.CameraController;
public final class m7 implements Runnable {
    public final int f51486a;
    public final o7 f51487b;

    public m7(o7 o7Var, int i10) {
        this.f51486a = i10;
        this.f51487b = o7Var;
    }

    @Override
    public final void run() {
        switch (this.f51486a) {
            case 0:
                o8 o8Var = this.f51487b.f51603a;
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
                this.f51487b.f51603a.J(1, true);
                return;
            case 2:
                this.f51487b.f51603a.J(1, true);
                return;
            default:
                this.f51487b.f51603a.J(1, true);
                return;
        }
    }
}
