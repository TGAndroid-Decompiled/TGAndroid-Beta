package qg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.la;
import org.telegram.ui.Wallet.t8;
public final class y0 implements TextureView.SurfaceTextureListener {
    public final la f43621a;
    public final c1 f43622b;

    public y0(c1 c1Var, la laVar) {
        this.f43622b = c1Var;
        this.f43621a = laVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            c1 c1Var = this.f43622b;
            if (c1Var.d == null) {
                a1 a1Var = new a1(c1Var, surfaceTexture, this.f43621a);
                c1Var.d = a1Var;
                a1Var.f43384n = i10;
                a1Var.f43385r = i11;
                c1Var.i();
                c1Var.post(new x0(this, 1));
                q0 q0Var = c1Var.f43399c;
                if (q0Var.v) {
                    q0Var.f43524f.f(new o0(q0Var, q0Var.f43539w, 0));
                    q0Var.f43539w = null;
                    q0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c1 c1Var = this.f43622b;
        if (c1Var.d != null && !c1Var.f43406y) {
            q0 q0Var = c1Var.f43399c;
            q0Var.f43524f.f(new t8(15, q0Var, new x0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        c1 c1Var = this.f43622b;
        a1 a1Var = c1Var.d;
        if (a1Var == null) {
            return;
        }
        a1Var.f43384n = i10;
        a1Var.f43385r = i11;
        c1Var.i();
        a1 a1Var2 = c1Var.d;
        a1Var2.postRunnable(a1Var2.f43387w);
        c1Var.d.postRunnable(new x0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
