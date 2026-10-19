package qg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ja;
public final class b1 implements TextureView.SurfaceTextureListener {
    public final ja f44468a;
    public final f1 f44469b;

    public b1(f1 f1Var, ja jaVar) {
        this.f44469b = f1Var;
        this.f44468a = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            f1 f1Var = this.f44469b;
            if (f1Var.d == null) {
                d1 d1Var = new d1(f1Var, surfaceTexture, this.f44468a);
                f1Var.d = d1Var;
                d1Var.f44483n = i10;
                d1Var.f44484r = i11;
                f1Var.i();
                f1Var.post(new a1(this, 1));
                t0 t0Var = f1Var.f44514c;
                if (t0Var.v) {
                    t0Var.f44630f.f(new r0(t0Var, t0Var.f44645w, 0));
                    t0Var.f44645w = null;
                    t0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f1 f1Var = this.f44469b;
        if (f1Var.d != null && !f1Var.f44521y) {
            t0 t0Var = f1Var.f44514c;
            t0Var.f44630f.f(new p2.b(1, t0Var, new a1(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        f1 f1Var = this.f44469b;
        d1 d1Var = f1Var.d;
        if (d1Var == null) {
            return;
        }
        d1Var.f44483n = i10;
        d1Var.f44484r = i11;
        f1Var.i();
        d1 d1Var2 = f1Var.d;
        d1Var2.postRunnable(d1Var2.f44486w);
        f1Var.d.postRunnable(new a1(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
