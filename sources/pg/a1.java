package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ka;
import org.telegram.ui.web.x1;
public final class a1 implements TextureView.SurfaceTextureListener {
    public final ka f44439a;
    public final f1 f44440b;

    public a1(f1 f1Var, ka kaVar) {
        this.f44440b = f1Var;
        this.f44439a = kaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            f1 f1Var = this.f44440b;
            if (f1Var.d == null) {
                d1 d1Var = new d1(f1Var, surfaceTexture, this.f44439a);
                f1Var.d = d1Var;
                d1Var.f44460n = i10;
                d1Var.f44461r = i11;
                f1Var.i();
                f1Var.post(new z0(this, 1));
                s0 s0Var = f1Var.f44493c;
                if (s0Var.v) {
                    s0Var.f44601f.f(new q0(s0Var, s0Var.f44616w, 0));
                    s0Var.f44616w = null;
                    s0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f1 f1Var = this.f44440b;
        if (f1Var.d != null && !f1Var.f44501y) {
            s0 s0Var = f1Var.f44493c;
            s0Var.f44601f.f(new x1(4, s0Var, new z0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        f1 f1Var = this.f44440b;
        d1 d1Var = f1Var.d;
        if (d1Var == null) {
            return;
        }
        d1Var.f44460n = i10;
        d1Var.f44461r = i11;
        f1Var.i();
        d1 d1Var2 = f1Var.d;
        d1Var2.postRunnable(d1Var2.f44463w);
        f1Var.d.postRunnable(new z0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
