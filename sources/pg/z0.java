package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.la;
public final class z0 implements TextureView.SurfaceTextureListener {
    public final la f45738a;
    public final d1 f45739b;

    public z0(d1 d1Var, la laVar) {
        this.f45739b = d1Var;
        this.f45738a = laVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            d1 d1Var = this.f45739b;
            if (d1Var.d == null) {
                b1 b1Var = new b1(d1Var, surfaceTexture, this.f45738a);
                d1Var.d = b1Var;
                b1Var.f45481n = i10;
                b1Var.f45482r = i11;
                d1Var.i();
                d1Var.post(new y0(this, 1));
                r0 r0Var = d1Var.f45517c;
                if (r0Var.v) {
                    r0Var.f45632f.f(new p0(r0Var, r0Var.f45647w, 0));
                    r0Var.f45647w = null;
                    r0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        d1 d1Var = this.f45739b;
        if (d1Var.d != null && !d1Var.f45525y) {
            r0 r0Var = d1Var.f45517c;
            r0Var.f45632f.f(new p2.b(1, r0Var, new y0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        d1 d1Var = this.f45739b;
        b1 b1Var = d1Var.d;
        if (b1Var == null) {
            return;
        }
        b1Var.f45481n = i10;
        b1Var.f45482r = i11;
        d1Var.i();
        b1 b1Var2 = d1Var.d;
        b1Var2.postRunnable(b1Var2.f45484w);
        d1Var.d.postRunnable(new y0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
