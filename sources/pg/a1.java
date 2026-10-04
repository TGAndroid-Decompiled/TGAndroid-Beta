package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ka;
import org.telegram.ui.web.x1;
public final class a1 implements TextureView.SurfaceTextureListener {
    public final ka f44432a;
    public final f1 f44433b;

    public a1(f1 f1Var, ka kaVar) {
        this.f44433b = f1Var;
        this.f44432a = kaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            f1 f1Var = this.f44433b;
            if (f1Var.d == null) {
                d1 d1Var = new d1(f1Var, surfaceTexture, this.f44432a);
                f1Var.d = d1Var;
                d1Var.f44453n = i10;
                d1Var.f44454r = i11;
                f1Var.i();
                f1Var.post(new z0(this, 1));
                s0 s0Var = f1Var.f44486c;
                if (s0Var.v) {
                    s0Var.f44594f.f(new q0(s0Var, s0Var.f44609w, 0));
                    s0Var.f44609w = null;
                    s0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f1 f1Var = this.f44433b;
        if (f1Var.d != null && !f1Var.f44494y) {
            s0 s0Var = f1Var.f44486c;
            s0Var.f44594f.f(new x1(4, s0Var, new z0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        f1 f1Var = this.f44433b;
        d1 d1Var = f1Var.d;
        if (d1Var == null) {
            return;
        }
        d1Var.f44453n = i10;
        d1Var.f44454r = i11;
        f1Var.i();
        d1 d1Var2 = f1Var.d;
        d1Var2.postRunnable(d1Var2.f44456w);
        f1Var.d.postRunnable(new z0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
