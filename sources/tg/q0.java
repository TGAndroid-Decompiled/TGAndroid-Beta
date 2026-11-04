package tg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.x9;
import org.telegram.ui.hc1;
public final class q0 implements TextureView.SurfaceTextureListener {
    public final x9 f55292a;
    public final u0 f55293b;

    public q0(u0 u0Var, x9 x9Var) {
        this.f55293b = u0Var;
        this.f55292a = x9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        if (surfaceTexture != null) {
            u0 u0Var = this.f55293b;
            if (u0Var.d == null) {
                s0 s0Var = new s0(u0Var, surfaceTexture, this.f55292a);
                u0Var.d = s0Var;
                s0Var.f55309n = i3;
                s0Var.f55310r = i10;
                u0Var.i();
                u0Var.post(new p0(this, 1));
                i0 i0Var = u0Var.f55323c;
                if (i0Var.v) {
                    i0Var.f55193f.f(new g0(i0Var, i0Var.f55208w, 0));
                    i0Var.f55208w = null;
                    i0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        u0 u0Var = this.f55293b;
        if (u0Var.d != null && !u0Var.E) {
            i0 i0Var = u0Var.f55323c;
            i0Var.f55193f.f(new hc1(28, i0Var, new p0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        u0 u0Var = this.f55293b;
        s0 s0Var = u0Var.d;
        if (s0Var == null) {
            return;
        }
        s0Var.f55309n = i3;
        s0Var.f55310r = i10;
        u0Var.i();
        s0 s0Var2 = u0Var.d;
        s0Var2.postRunnable(s0Var2.f55313x);
        u0Var.d.postRunnable(new p0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
