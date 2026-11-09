package wi;

import android.graphics.SurfaceTexture;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final int f58132a;
    public final Object f58133b;

    public p(Object obj, int i7) {
        this.f58132a = i7;
        this.f58133b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f58132a) {
            case 0:
                ((t) this.f58133b).b(true);
                return;
            case 1:
                ((t) this.f58133b).b(false);
                return;
            default:
                v0 v0Var = (v0) this.f58133b;
                synchronized (v0Var.f58235b) {
                    v0Var.f58244m = true;
                    v0Var.f58235b.notifyAll();
                }
                return;
        }
    }
}
