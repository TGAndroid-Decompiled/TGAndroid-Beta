package wi;

import android.graphics.SurfaceTexture;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final int f58027a;
    public final Object f58028b;

    public p(Object obj, int i7) {
        this.f58027a = i7;
        this.f58028b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f58027a) {
            case 0:
                ((u) this.f58028b).b(true);
                return;
            case 1:
                ((u) this.f58028b).b(false);
                return;
            default:
                w0 w0Var = (w0) this.f58028b;
                synchronized (w0Var.f58136b) {
                    w0Var.f58145m = true;
                    w0Var.f58136b.notifyAll();
                }
                return;
        }
    }
}
