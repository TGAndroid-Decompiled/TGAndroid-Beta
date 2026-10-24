package qg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ha;
public final class a1 implements TextureView.SurfaceTextureListener {
    public final ha f44887a;
    public final e1 f44888b;

    public a1(e1 e1Var, ha haVar) {
        this.f44888b = e1Var;
        this.f44887a = haVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            e1 e1Var = this.f44888b;
            if (e1Var.d == null) {
                c1 c1Var = new c1(e1Var, surfaceTexture, this.f44887a);
                e1Var.d = c1Var;
                c1Var.f44901n = i10;
                c1Var.f44902r = i11;
                e1Var.i();
                e1Var.post(new z0(this, 1));
                s0 s0Var = e1Var.f44935c;
                if (s0Var.v) {
                    s0Var.f45046f.f(new q0(s0Var, s0Var.f45061w, 0));
                    s0Var.f45061w = null;
                    s0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e1 e1Var = this.f44888b;
        if (e1Var.d != null && !e1Var.f44942y) {
            s0 s0Var = e1Var.f44935c;
            s0Var.f45046f.f(new p2.b(1, s0Var, new z0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e1 e1Var = this.f44888b;
        c1 c1Var = e1Var.d;
        if (c1Var == null) {
            return;
        }
        c1Var.f44901n = i10;
        c1Var.f44902r = i11;
        e1Var.i();
        c1 c1Var2 = e1Var.d;
        c1Var2.postRunnable(c1Var2.f44904w);
        e1Var.d.postRunnable(new z0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
