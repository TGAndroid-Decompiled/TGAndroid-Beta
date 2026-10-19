package qg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ja;
public final class b1 implements TextureView.SurfaceTextureListener {
    public final ja f44466a;
    public final f1 f44467b;

    public b1(f1 f1Var, ja jaVar) {
        this.f44467b = f1Var;
        this.f44466a = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            f1 f1Var = this.f44467b;
            if (f1Var.d == null) {
                d1 d1Var = new d1(f1Var, surfaceTexture, this.f44466a);
                f1Var.d = d1Var;
                d1Var.f44481n = i10;
                d1Var.f44482r = i11;
                f1Var.i();
                f1Var.post(new a1(this, 1));
                t0 t0Var = f1Var.f44512c;
                if (t0Var.v) {
                    t0Var.f44628f.f(new r0(t0Var, t0Var.f44643w, 0));
                    t0Var.f44643w = null;
                    t0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f1 f1Var = this.f44467b;
        if (f1Var.d != null && !f1Var.f44519y) {
            t0 t0Var = f1Var.f44512c;
            t0Var.f44628f.f(new p2.b(1, t0Var, new a1(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        f1 f1Var = this.f44467b;
        d1 d1Var = f1Var.d;
        if (d1Var == null) {
            return;
        }
        d1Var.f44481n = i10;
        d1Var.f44482r = i11;
        f1Var.i();
        d1 d1Var2 = f1Var.d;
        d1Var2.postRunnable(d1Var2.f44484w);
        f1Var.d.postRunnable(new a1(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
