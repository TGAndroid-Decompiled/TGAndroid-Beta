package sg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.x9;
public final class r0 implements TextureView.SurfaceTextureListener {
    public final x9 f55205a;
    public final v0 f55206b;

    public r0(v0 v0Var, x9 x9Var) {
        this.f55206b = v0Var;
        this.f55205a = x9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        if (surfaceTexture != null) {
            v0 v0Var = this.f55206b;
            if (v0Var.d == null) {
                t0 t0Var = new t0(v0Var, surfaceTexture, this.f55205a);
                v0Var.d = t0Var;
                t0Var.f55219n = i7;
                t0Var.f55220r = i10;
                v0Var.i();
                v0Var.post(new q0(this, 1));
                j0 j0Var = v0Var.f55235c;
                if (j0Var.v) {
                    j0Var.f55102f.f(new g0(j0Var, j0Var.f55117w, 0));
                    j0Var.f55117w = null;
                    j0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        v0 v0Var = this.f55206b;
        if (v0Var.d != null && !v0Var.D) {
            j0 j0Var = v0Var.f55235c;
            j0Var.f55102f.f(new org.telegram.ui.web.s(19, j0Var, new q0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        v0 v0Var = this.f55206b;
        t0 t0Var = v0Var.d;
        if (t0Var == null) {
            return;
        }
        t0Var.f55219n = i7;
        t0Var.f55220r = i10;
        v0Var.i();
        t0 t0Var2 = v0Var.d;
        t0Var2.postRunnable(t0Var2.f55223x);
        v0Var.d.postRunnable(new q0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
