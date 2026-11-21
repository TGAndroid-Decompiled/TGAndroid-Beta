package zi;

import android.graphics.SurfaceTexture;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final int f62278a;
    public final Object f62279b;

    public p(Object obj, int i7) {
        this.f62278a = i7;
        this.f62279b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f62278a) {
            case 0:
                ((t) this.f62279b).b(true);
                return;
            case 1:
                ((t) this.f62279b).b(false);
                return;
            default:
                w0 w0Var = (w0) this.f62279b;
                synchronized (w0Var.f62387b) {
                    w0Var.f62396m = true;
                    w0Var.f62387b.notifyAll();
                }
                return;
        }
    }
}
