package wi;

import android.graphics.SurfaceTexture;
public final class q implements SurfaceTexture.OnFrameAvailableListener {
    public final int f57996a;
    public final Object f57997b;

    public q(Object obj, int i3) {
        this.f57996a = i3;
        this.f57997b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f57996a) {
            case 0:
                ((s) this.f57997b).b(false);
                return;
            case 1:
                ((s) this.f57997b).b(true);
                return;
            default:
                v0 v0Var = (v0) this.f57997b;
                synchronized (v0Var.f58089b) {
                    v0Var.f58098m = true;
                    v0Var.f58089b.notifyAll();
                }
                return;
        }
    }
}
