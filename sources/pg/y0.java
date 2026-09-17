package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ha;
public final class y0 implements TextureView.SurfaceTextureListener {
    public final ha f41070a;
    public final c1 f41071b;

    public y0(c1 c1Var, ha haVar) {
        this.f41071b = c1Var;
        this.f41070a = haVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            c1 c1Var = this.f41071b;
            if (c1Var.d == null) {
                a1 a1Var = new a1(c1Var, surfaceTexture, this.f41070a);
                c1Var.d = a1Var;
                a1Var.f40833n = i10;
                a1Var.f40834r = i11;
                c1Var.i();
                c1Var.post(new x0(this, 1));
                q0 q0Var = c1Var.f40848c;
                if (q0Var.v) {
                    q0Var.f40973f.f(new o0(q0Var, q0Var.f40988w, 0));
                    q0Var.f40988w = null;
                    q0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c1 c1Var = this.f41071b;
        if (c1Var.d != null && !c1Var.f40855y) {
            q0 q0Var = c1Var.f40848c;
            q0Var.f40973f.f(new p2.b(1, q0Var, new x0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        c1 c1Var = this.f41071b;
        a1 a1Var = c1Var.d;
        if (a1Var == null) {
            return;
        }
        a1Var.f40833n = i10;
        a1Var.f40834r = i11;
        c1Var.i();
        a1 a1Var2 = c1Var.d;
        a1Var2.postRunnable(a1Var2.f40836w);
        c1Var.d.postRunnable(new x0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
