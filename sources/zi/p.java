package zi;

import android.graphics.SurfaceTexture;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final int f62247a;
    public final Object f62248b;

    public p(Object obj, int i7) {
        this.f62247a = i7;
        this.f62248b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f62247a) {
            case 0:
                ((t) this.f62248b).b(true);
                return;
            case 1:
                ((t) this.f62248b).b(false);
                return;
            default:
                w0 w0Var = (w0) this.f62248b;
                synchronized (w0Var.f62356b) {
                    w0Var.f62365m = true;
                    w0Var.f62356b.notifyAll();
                }
                return;
        }
    }
}
