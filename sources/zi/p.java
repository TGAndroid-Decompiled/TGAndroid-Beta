package zi;

import android.graphics.SurfaceTexture;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final int f62236a;
    public final Object f62237b;

    public p(Object obj, int i7) {
        this.f62236a = i7;
        this.f62237b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f62236a) {
            case 0:
                ((t) this.f62237b).b(true);
                return;
            case 1:
                ((t) this.f62237b).b(false);
                return;
            default:
                w0 w0Var = (w0) this.f62237b;
                synchronized (w0Var.f62345b) {
                    w0Var.f62354m = true;
                    w0Var.f62345b.notifyAll();
                }
                return;
        }
    }
}
