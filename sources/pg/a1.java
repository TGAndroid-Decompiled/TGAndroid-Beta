package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ia;
public final class a1 implements TextureView.SurfaceTextureListener {
    public final ia f41103a;
    public final e1 f41104b;

    public a1(e1 e1Var, ia iaVar) {
        this.f41104b = e1Var;
        this.f41103a = iaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            e1 e1Var = this.f41104b;
            if (e1Var.d == null) {
                c1 c1Var = new c1(e1Var, surfaceTexture, this.f41103a);
                e1Var.d = c1Var;
                c1Var.f41118n = i10;
                c1Var.f41119r = i11;
                e1Var.i();
                e1Var.post(new z0(this, 1));
                s0 s0Var = e1Var.f41150c;
                if (s0Var.v) {
                    s0Var.f41264f.f(new q0(s0Var, s0Var.f41279w, 0));
                    s0Var.f41279w = null;
                    s0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e1 e1Var = this.f41104b;
        if (e1Var.d != null && !e1Var.f41157y) {
            s0 s0Var = e1Var.f41150c;
            s0Var.f41264f.f(new org.telegram.ui.web.g1(7, s0Var, new z0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e1 e1Var = this.f41104b;
        c1 c1Var = e1Var.d;
        if (c1Var == null) {
            return;
        }
        c1Var.f41118n = i10;
        c1Var.f41119r = i11;
        e1Var.i();
        c1 c1Var2 = e1Var.d;
        c1Var2.postRunnable(c1Var2.f41121w);
        e1Var.d.postRunnable(new z0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
