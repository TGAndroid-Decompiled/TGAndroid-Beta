package wi;

import android.graphics.SurfaceTexture;
public final class r implements SurfaceTexture.OnFrameAvailableListener {
    public final int f58016a;
    public final Object f58017b;

    public r(Object obj, int i7) {
        this.f58016a = i7;
        this.f58017b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f58016a) {
            case 0:
                ((t) this.f58017b).b(false);
                return;
            case 1:
                ((t) this.f58017b).b(true);
                return;
            default:
                v0 v0Var = (v0) this.f58017b;
                synchronized (v0Var.f58106b) {
                    v0Var.f58115m = true;
                    v0Var.f58106b.notifyAll();
                }
                return;
        }
    }
}
