package wi;

import android.graphics.SurfaceTexture;
public final class r implements SurfaceTexture.OnFrameAvailableListener {
    public final int f58041a;
    public final Object f58042b;

    public r(Object obj, int i7) {
        this.f58041a = i7;
        this.f58042b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f58041a) {
            case 0:
                ((t) this.f58042b).b(false);
                return;
            case 1:
                ((t) this.f58042b).b(true);
                return;
            default:
                v0 v0Var = (v0) this.f58042b;
                synchronized (v0Var.f58131b) {
                    v0Var.f58140m = true;
                    v0Var.f58131b.notifyAll();
                }
                return;
        }
    }
}
