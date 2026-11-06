package sg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.y9;
public final class r0 implements TextureView.SurfaceTextureListener {
    public final y9 f55104a;
    public final w0 f55105b;

    public r0(w0 w0Var, y9 y9Var) {
        this.f55105b = w0Var;
        this.f55104a = y9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        if (surfaceTexture != null) {
            w0 w0Var = this.f55105b;
            if (w0Var.d == null) {
                u0 u0Var = new u0(w0Var, surfaceTexture, this.f55104a);
                w0Var.d = u0Var;
                u0Var.f55123n = i7;
                u0Var.f55124r = i10;
                w0Var.i();
                w0Var.post(new q0(this, 1));
                j0 j0Var = w0Var.f55159c;
                if (j0Var.v) {
                    j0Var.f54998f.f(new g0(j0Var, j0Var.f55013w, 0));
                    j0Var.f55013w = null;
                    j0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        w0 w0Var = this.f55105b;
        if (w0Var.d != null && !w0Var.D) {
            j0 j0Var = w0Var.f55159c;
            j0Var.f54998f.f(new org.telegram.ui.web.w(23, j0Var, new q0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        w0 w0Var = this.f55105b;
        u0 u0Var = w0Var.d;
        if (u0Var == null) {
            return;
        }
        u0Var.f55123n = i7;
        u0Var.f55124r = i10;
        w0Var.i();
        u0 u0Var2 = w0Var.d;
        u0Var2.postRunnable(u0Var2.f55127x);
        w0Var.d.postRunnable(new q0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
