package qg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.la;
public final class y0 implements TextureView.SurfaceTextureListener {
    public final la f43363a;
    public final c1 f43364b;

    public y0(c1 c1Var, la laVar) {
        this.f43364b = c1Var;
        this.f43363a = laVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            c1 c1Var = this.f43364b;
            if (c1Var.d == null) {
                a1 a1Var = new a1(c1Var, surfaceTexture, this.f43363a);
                c1Var.d = a1Var;
                a1Var.f43126n = i10;
                a1Var.f43127r = i11;
                c1Var.i();
                c1Var.post(new x0(this, 1));
                q0 q0Var = c1Var.f43141c;
                if (q0Var.v) {
                    q0Var.f43266f.f(new o0(q0Var, q0Var.f43281w, 0));
                    q0Var.f43281w = null;
                    q0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c1 c1Var = this.f43364b;
        if (c1Var.d != null && !c1Var.f43148y) {
            q0 q0Var = c1Var.f43141c;
            q0Var.f43266f.f(new org.telegram.ui.web.v(13, q0Var, new x0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        c1 c1Var = this.f43364b;
        a1 a1Var = c1Var.d;
        if (a1Var == null) {
            return;
        }
        a1Var.f43126n = i10;
        a1Var.f43127r = i11;
        c1Var.i();
        a1 a1Var2 = c1Var.d;
        a1Var2.postRunnable(a1Var2.f43129w);
        c1Var.d.postRunnable(new x0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
