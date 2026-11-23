package zi;

import android.graphics.SurfaceTexture;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final int f62367a;
    public final Object f62368b;

    public p(Object obj, int i7) {
        this.f62367a = i7;
        this.f62368b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f62367a) {
            case 0:
                ((t) this.f62368b).b(true);
                return;
            case 1:
                ((t) this.f62368b).b(false);
                return;
            default:
                w0 w0Var = (w0) this.f62368b;
                synchronized (w0Var.f62476b) {
                    w0Var.f62485m = true;
                    w0Var.f62476b.notifyAll();
                }
                return;
        }
    }
}
