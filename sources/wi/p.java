package wi;

import android.graphics.SurfaceTexture;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final int f58122a;
    public final Object f58123b;

    public p(Object obj, int i7) {
        this.f58122a = i7;
        this.f58123b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f58122a) {
            case 0:
                ((t) this.f58123b).b(true);
                return;
            case 1:
                ((t) this.f58123b).b(false);
                return;
            default:
                v0 v0Var = (v0) this.f58123b;
                synchronized (v0Var.f58225b) {
                    v0Var.f58234m = true;
                    v0Var.f58225b.notifyAll();
                }
                return;
        }
    }
}
