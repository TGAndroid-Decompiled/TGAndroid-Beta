package wi;

import android.graphics.SurfaceTexture;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final int f58136a;
    public final Object f58137b;

    public p(Object obj, int i7) {
        this.f58136a = i7;
        this.f58137b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f58136a) {
            case 0:
                ((t) this.f58137b).b(true);
                return;
            case 1:
                ((t) this.f58137b).b(false);
                return;
            default:
                v0 v0Var = (v0) this.f58137b;
                synchronized (v0Var.f58239b) {
                    v0Var.f58248m = true;
                    v0Var.f58239b.notifyAll();
                }
                return;
        }
    }
}
