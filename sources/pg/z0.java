package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ja;
public final class z0 implements TextureView.SurfaceTextureListener {
    public final ja f41004a;
    public final d1 f41005b;

    public z0(d1 d1Var, ja jaVar) {
        this.f41005b = d1Var;
        this.f41004a = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            d1 d1Var = this.f41005b;
            if (d1Var.d == null) {
                b1 b1Var = new b1(d1Var, surfaceTexture, this.f41004a);
                d1Var.d = b1Var;
                b1Var.f40767n = i10;
                b1Var.f40768r = i11;
                d1Var.i();
                d1Var.post(new y0(this, 1));
                r0 r0Var = d1Var.f40801c;
                if (r0Var.v) {
                    r0Var.f40908f.f(new p0(r0Var, r0Var.f40923w, 0));
                    r0Var.f40923w = null;
                    r0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        d1 d1Var = this.f41005b;
        if (d1Var.d != null && !d1Var.f40808y) {
            r0 r0Var = d1Var.f40801c;
            r0Var.f40908f.f(new p2.b(1, r0Var, new y0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        d1 d1Var = this.f41005b;
        b1 b1Var = d1Var.d;
        if (b1Var == null) {
            return;
        }
        b1Var.f40767n = i10;
        b1Var.f40768r = i11;
        d1Var.i();
        b1 b1Var2 = d1Var.d;
        b1Var2.postRunnable(b1Var2.f40770w);
        d1Var.d.postRunnable(new y0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
