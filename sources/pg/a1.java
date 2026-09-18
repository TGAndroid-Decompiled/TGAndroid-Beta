package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ja;
public final class a1 implements TextureView.SurfaceTextureListener {
    public final ja f41062a;
    public final e1 f41063b;

    public a1(e1 e1Var, ja jaVar) {
        this.f41063b = e1Var;
        this.f41062a = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            e1 e1Var = this.f41063b;
            if (e1Var.d == null) {
                c1 c1Var = new c1(e1Var, surfaceTexture, this.f41062a);
                e1Var.d = c1Var;
                c1Var.f41077n = i10;
                c1Var.f41078r = i11;
                e1Var.i();
                e1Var.post(new z0(this, 1));
                s0 s0Var = e1Var.f41109c;
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
        e1 e1Var = this.f41063b;
        if (e1Var.d != null && !e1Var.f41116y) {
            s0 s0Var = e1Var.f41109c;
            s0Var.f41223f.f(new org.telegram.ui.web.p1(5, s0Var, new z0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e1 e1Var = this.f41063b;
        c1 c1Var = e1Var.d;
        if (c1Var == null) {
            return;
        }
        c1Var.f41077n = i10;
        c1Var.f41078r = i11;
        e1Var.i();
        c1 c1Var2 = e1Var.d;
        c1Var2.postRunnable(c1Var2.f41080w);
        e1Var.d.postRunnable(new z0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
