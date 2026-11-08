package wi;

import android.graphics.SurfaceTexture;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final int f58123a;
    public final Object f58124b;

    public p(Object obj, int i7) {
        this.f58123a = i7;
        this.f58124b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f58123a) {
            case 0:
                ((t) this.f58124b).b(true);
                return;
            case 1:
                ((t) this.f58124b).b(false);
                return;
            default:
                v0 v0Var = (v0) this.f58124b;
                synchronized (v0Var.f58226b) {
                    v0Var.f58235m = true;
                    v0Var.f58226b.notifyAll();
                }
                return;
        }
    }
}
