package sg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ba;
import org.telegram.ui.web.t1;
public final class p0 implements TextureView.SurfaceTextureListener {
    public final ba f57435a;
    public final t0 f57436b;

    public p0(t0 t0Var, ba baVar) {
        this.f57436b = t0Var;
        this.f57435a = baVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        if (surfaceTexture != null) {
            t0 t0Var = this.f57436b;
            if (t0Var.d == null) {
                r0 r0Var = new r0(t0Var, surfaceTexture, this.f57435a);
                t0Var.d = r0Var;
                r0Var.f57458n = i7;
                r0Var.f57459r = i10;
                t0Var.i();
                t0Var.post(new o0(this, 1));
                h0 h0Var = t0Var.f57471c;
                if (h0Var.v) {
                    h0Var.f57343f.f(new f0(h0Var, h0Var.f57358w, 0));
                    h0Var.f57358w = null;
                    h0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        t0 t0Var = this.f57436b;
        if (t0Var.d != null && !t0Var.E) {
            h0 h0Var = t0Var.f57471c;
            h0Var.f57343f.f(new t1(14, h0Var, new o0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        t0 t0Var = this.f57436b;
        r0 r0Var = t0Var.d;
        if (r0Var == null) {
            return;
        }
        r0Var.f57458n = i7;
        r0Var.f57459r = i10;
        t0Var.i();
        r0 r0Var2 = t0Var.d;
        r0Var2.postRunnable(r0Var2.f57462x);
        t0Var.d.postRunnable(new o0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
