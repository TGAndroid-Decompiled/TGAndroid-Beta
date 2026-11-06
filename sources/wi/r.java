package wi;

import android.graphics.SurfaceTexture;
public final class r implements SurfaceTexture.OnFrameAvailableListener {
    public final int f58040a;
    public final Object f58041b;

    public r(Object obj, int i7) {
        this.f58040a = i7;
        this.f58041b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f58040a) {
            case 0:
                ((t) this.f58041b).b(false);
                return;
            case 1:
                ((t) this.f58041b).b(true);
                return;
            default:
                v0 v0Var = (v0) this.f58041b;
                synchronized (v0Var.f58130b) {
                    v0Var.f58139m = true;
                    v0Var.f58130b.notifyAll();
                }
                return;
        }
    }
}
