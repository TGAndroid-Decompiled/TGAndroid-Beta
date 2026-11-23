package sg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ca;
public final class q0 implements TextureView.SurfaceTextureListener {
    public final ca f57335a;
    public final u0 f57336b;

    public q0(u0 u0Var, ca caVar) {
        this.f57336b = u0Var;
        this.f57335a = caVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        if (surfaceTexture != null) {
            u0 u0Var = this.f57336b;
            if (u0Var.d == null) {
                s0 s0Var = new s0(u0Var, surfaceTexture, this.f57335a);
                u0Var.d = s0Var;
                s0Var.f57352n = i7;
                s0Var.f57353r = i10;
                u0Var.i();
                u0Var.post(new p0(this, 1));
                i0 i0Var = u0Var.f57368c;
                if (i0Var.v) {
                    i0Var.f57235f.f(new f0(i0Var, i0Var.f57250w, 0));
                    i0Var.f57250w = null;
                    i0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        u0 u0Var = this.f57336b;
        if (u0Var.d != null && !u0Var.E) {
            i0 i0Var = u0Var.f57368c;
            i0Var.f57235f.f(new p4.o0(8, i0Var, new p0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        u0 u0Var = this.f57336b;
        s0 s0Var = u0Var.d;
        if (s0Var == null) {
            return;
        }
        s0Var.f57352n = i7;
        s0Var.f57353r = i10;
        u0Var.i();
        s0 s0Var2 = u0Var.d;
        s0Var2.postRunnable(s0Var2.f57356x);
        u0Var.d.postRunnable(new p0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
