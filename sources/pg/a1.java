package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ja;
public final class a1 implements TextureView.SurfaceTextureListener {
    public final ja f41073a;
    public final f1 f41074b;

    public a1(f1 f1Var, ja jaVar) {
        this.f41074b = f1Var;
        this.f41073a = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            f1 f1Var = this.f41074b;
            if (f1Var.d == null) {
                d1 d1Var = new d1(f1Var, surfaceTexture, this.f41073a);
                f1Var.d = d1Var;
                d1Var.f41092n = i10;
                d1Var.f41093r = i11;
                f1Var.i();
                f1Var.post(new z0(this, 1));
                s0 s0Var = f1Var.f41124c;
                if (s0Var.v) {
                    s0Var.f41223f.f(new q0(s0Var, s0Var.f41238w, 0));
                    s0Var.f41238w = null;
                    s0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f1 f1Var = this.f41074b;
        if (f1Var.d != null && !f1Var.f41131y) {
            s0 s0Var = f1Var.f41124c;
            s0Var.f41223f.f(new org.telegram.ui.web.o1(6, s0Var, new z0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        f1 f1Var = this.f41074b;
        d1 d1Var = f1Var.d;
        if (d1Var == null) {
            return;
        }
        d1Var.f41092n = i10;
        d1Var.f41093r = i11;
        f1Var.i();
        d1 d1Var2 = f1Var.d;
        d1Var2.postRunnable(d1Var2.f41095w);
        f1Var.d.postRunnable(new z0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
