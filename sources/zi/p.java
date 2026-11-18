package zi;

import android.graphics.SurfaceTexture;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final int f62237a;
    public final Object f62238b;

    public p(Object obj, int i7) {
        this.f62237a = i7;
        this.f62238b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f62237a) {
            case 0:
                ((t) this.f62238b).b(true);
                return;
            case 1:
                ((t) this.f62238b).b(false);
                return;
            default:
                w0 w0Var = (w0) this.f62238b;
                synchronized (w0Var.f62346b) {
                    w0Var.f62355m = true;
                    w0Var.f62346b.notifyAll();
                }
                return;
        }
    }
}
