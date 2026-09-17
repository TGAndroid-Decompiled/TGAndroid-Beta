package qg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ja;
public final class y0 implements TextureView.SurfaceTextureListener {
    public final ja f44631a;
    public final c1 f44632b;

    public y0(c1 c1Var, ja jaVar) {
        this.f44632b = c1Var;
        this.f44631a = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            c1 c1Var = this.f44632b;
            if (c1Var.d == null) {
                a1 a1Var = new a1(c1Var, surfaceTexture, this.f44631a);
                c1Var.d = a1Var;
                a1Var.f44374n = i10;
                a1Var.f44375r = i11;
                c1Var.i();
                c1Var.post(new x0(this, 1));
                q0 q0Var = c1Var.f44390c;
                if (q0Var.v) {
                    q0Var.f44523f.f(new o0(q0Var, q0Var.f44538w, 0));
                    q0Var.f44538w = null;
                    q0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c1 c1Var = this.f44632b;
        if (c1Var.d != null && !c1Var.f44398y) {
            q0 q0Var = c1Var.f44390c;
            q0Var.f44523f.f(new org.telegram.ui.web.g1(9, q0Var, new x0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        c1 c1Var = this.f44632b;
        a1 a1Var = c1Var.d;
        if (a1Var == null) {
            return;
        }
        a1Var.f44374n = i10;
        a1Var.f44375r = i11;
        c1Var.i();
        a1 a1Var2 = c1Var.d;
        a1Var2.postRunnable(a1Var2.f44377w);
        c1Var.d.postRunnable(new x0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
