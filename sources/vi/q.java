package vi;

import android.graphics.SurfaceTexture;
public final class q implements SurfaceTexture.OnFrameAvailableListener {
    public final int f50572a;
    public final Object f50573b;

    public q(Object obj, int i10) {
        this.f50572a = i10;
        this.f50573b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f50572a) {
            case 0:
                ((s) this.f50573b).b(false);
                return;
            case 1:
                ((s) this.f50573b).b(true);
                return;
            default:
                w0 w0Var = (w0) this.f50573b;
                synchronized (w0Var.f50684b) {
                    w0Var.f50692m = true;
                    w0Var.f50684b.notifyAll();
                }
                return;
        }
    }
}
