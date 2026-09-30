package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ja;
public final class a1 implements TextureView.SurfaceTextureListener {
    public final ja f41076a;
    public final f1 f41077b;

    public a1(f1 f1Var, ja jaVar) {
        this.f41077b = f1Var;
        this.f41076a = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            f1 f1Var = this.f41077b;
            if (f1Var.d == null) {
                d1 d1Var = new d1(f1Var, surfaceTexture, this.f41076a);
                f1Var.d = d1Var;
                d1Var.f41095n = i10;
                d1Var.f41096r = i11;
                f1Var.i();
                f1Var.post(new z0(this, 1));
                s0 s0Var = f1Var.f41127c;
                if (s0Var.v) {
                    s0Var.f41226f.f(new q0(s0Var, s0Var.f41241w, 0));
                    s0Var.f41241w = null;
                    s0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f1 f1Var = this.f41077b;
        if (f1Var.d != null && !f1Var.f41134y) {
            s0 s0Var = f1Var.f41127c;
            s0Var.f41226f.f(new org.telegram.ui.web.f1(7, s0Var, new z0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        f1 f1Var = this.f41077b;
        d1 d1Var = f1Var.d;
        if (d1Var == null) {
            return;
        }
        d1Var.f41095n = i10;
        d1Var.f41096r = i11;
        f1Var.i();
        d1 d1Var2 = f1Var.d;
        d1Var2.postRunnable(d1Var2.f41098w);
        f1Var.d.postRunnable(new z0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
