package yf;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.z9;
import rh.o2;

public final class x0 implements TextureView.SurfaceTextureListener {

    public final z9 f50118a;

    public final b1 f50119b;

    public x0(b1 b1Var, z9 z9Var) {
        this.f50119b = b1Var;
        this.f50118a = z9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            b1 b1Var = this.f50119b;
            if (b1Var.d != null) {
                return;
            }
            z0 z0Var = new z0(b1Var, surfaceTexture, this.f50118a);
            b1Var.d = z0Var;
            z0Var.f50135n = i10;
            z0Var.f50136r = i11;
            b1Var.i();
            b1Var.post(new w0(this, 1));
            p0 p0Var = b1Var.f49880c;
            if (p0Var.v) {
                p0Var.f50015f.f(new n0(p0Var, p0Var.f50030w, 0));
                p0Var.f50030w = null;
                p0Var.v = false;
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b1 b1Var = this.f50119b;
        if (b1Var.d != null && !b1Var.f49888y) {
            p0 p0Var = b1Var.f49880c;
            p0Var.f50015f.f(new o2(6, p0Var, new w0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        b1 b1Var = this.f50119b;
        z0 z0Var = b1Var.d;
        if (z0Var == null) {
            return;
        }
        z0Var.f50135n = i10;
        z0Var.f50136r = i11;
        b1Var.i();
        z0 z0Var2 = b1Var.d;
        z0Var2.postRunnable(z0Var2.f50138w);
        b1Var.d.postRunnable(new w0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
