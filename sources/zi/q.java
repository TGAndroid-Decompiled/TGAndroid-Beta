package zi;

import android.graphics.SurfaceTexture;
public final class q implements SurfaceTexture.OnFrameAvailableListener {
    public final int f61672a;
    public final Object f61673b;

    public q(Object obj, int i7) {
        this.f61672a = i7;
        this.f61673b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f61672a) {
            case 0:
                ((u) this.f61673b).b(true);
                return;
            case 1:
                ((u) this.f61673b).b(false);
                return;
            default:
                x0 x0Var = (x0) this.f61673b;
                synchronized (x0Var.f61781b) {
                    x0Var.f61790m = true;
                    x0Var.f61781b.notifyAll();
                }
                return;
        }
    }
}
