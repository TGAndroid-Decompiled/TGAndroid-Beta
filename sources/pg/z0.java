package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.la;
import org.telegram.ui.web.f2;
public final class z0 implements TextureView.SurfaceTextureListener {
    public final la f45743a;
    public final d1 f45744b;

    public z0(d1 d1Var, la laVar) {
        this.f45744b = d1Var;
        this.f45743a = laVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            d1 d1Var = this.f45744b;
            if (d1Var.d == null) {
                b1 b1Var = new b1(d1Var, surfaceTexture, this.f45743a);
                d1Var.d = b1Var;
                b1Var.f45486n = i10;
                b1Var.f45487r = i11;
                d1Var.i();
                d1Var.post(new y0(this, 1));
                r0 r0Var = d1Var.f45522c;
                if (r0Var.v) {
                    r0Var.f45637f.f(new p0(r0Var, r0Var.f45652w, 0));
                    r0Var.f45652w = null;
                    r0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        d1 d1Var = this.f45744b;
        if (d1Var.d != null && !d1Var.f45530y) {
            r0 r0Var = d1Var.f45522c;
            r0Var.f45637f.f(new f2(2, r0Var, new y0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        d1 d1Var = this.f45744b;
        b1 b1Var = d1Var.d;
        if (b1Var == null) {
            return;
        }
        b1Var.f45486n = i10;
        b1Var.f45487r = i11;
        d1Var.i();
        b1 b1Var2 = d1Var.d;
        b1Var2.postRunnable(b1Var2.f45489w);
        d1Var.d.postRunnable(new y0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
