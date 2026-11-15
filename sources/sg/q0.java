package sg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.u9;
public final class q0 implements TextureView.SurfaceTextureListener {
    public final u9 f56751a;
    public final u0 f56752b;

    public q0(u0 u0Var, u9 u9Var) {
        this.f56752b = u0Var;
        this.f56751a = u9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        if (surfaceTexture != null) {
            u0 u0Var = this.f56752b;
            if (u0Var.d == null) {
                s0 s0Var = new s0(u0Var, surfaceTexture, this.f56751a);
                u0Var.d = s0Var;
                s0Var.f56768n = i7;
                s0Var.f56769r = i10;
                u0Var.i();
                u0Var.post(new p0(this, 1));
                i0 i0Var = u0Var.f56784c;
                if (i0Var.v) {
                    i0Var.f56651f.f(new f0(i0Var, i0Var.f56666w, 0));
                    i0Var.f56666w = null;
                    i0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        u0 u0Var = this.f56752b;
        if (u0Var.d != null && !u0Var.E) {
            i0 i0Var = u0Var.f56784c;
            i0Var.f56651f.f(new org.telegram.ui.web.e1(16, i0Var, new p0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        u0 u0Var = this.f56752b;
        s0 s0Var = u0Var.d;
        if (s0Var == null) {
            return;
        }
        s0Var.f56768n = i7;
        s0Var.f56769r = i10;
        u0Var.i();
        s0 s0Var2 = u0Var.d;
        s0Var2.postRunnable(s0Var2.f56772x);
        u0Var.d.postRunnable(new p0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
