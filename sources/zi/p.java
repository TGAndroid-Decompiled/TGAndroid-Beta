package zi;

import android.graphics.SurfaceTexture;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final int f62282a;
    public final Object f62283b;

    public p(Object obj, int i7) {
        this.f62282a = i7;
        this.f62283b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f62282a) {
            case 0:
                ((t) this.f62283b).b(true);
                return;
            case 1:
                ((t) this.f62283b).b(false);
                return;
            default:
                w0 w0Var = (w0) this.f62283b;
                synchronized (w0Var.f62391b) {
                    w0Var.f62400m = true;
                    w0Var.f62391b.notifyAll();
                }
                return;
        }
    }
}
