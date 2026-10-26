package rg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.la;
import org.telegram.ui.Wallet.q6;
public final class y0 implements TextureView.SurfaceTextureListener {
    public final la f47599a;
    public final c1 f47600b;

    public y0(c1 c1Var, la laVar) {
        this.f47600b = c1Var;
        this.f47599a = laVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            c1 c1Var = this.f47600b;
            if (c1Var.d == null) {
                a1 a1Var = new a1(c1Var, surfaceTexture, this.f47599a);
                c1Var.d = a1Var;
                a1Var.f47363n = i10;
                a1Var.f47364r = i11;
                c1Var.i();
                c1Var.post(new x0(this, 1));
                q0 q0Var = c1Var.f47377c;
                if (q0Var.v) {
                    q0Var.f47506f.f(new o0(q0Var, q0Var.f47521w, 0));
                    q0Var.f47521w = null;
                    q0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c1 c1Var = this.f47600b;
        if (c1Var.d != null && !c1Var.f47384y) {
            q0 q0Var = c1Var.f47377c;
            q0Var.f47506f.f(new q6(25, q0Var, new x0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        c1 c1Var = this.f47600b;
        a1 a1Var = c1Var.d;
        if (a1Var == null) {
            return;
        }
        a1Var.f47363n = i10;
        a1Var.f47364r = i11;
        c1Var.i();
        a1 a1Var2 = c1Var.d;
        a1Var2.postRunnable(a1Var2.f47366w);
        c1Var.d.postRunnable(new x0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
