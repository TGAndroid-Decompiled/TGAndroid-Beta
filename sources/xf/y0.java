package xf;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ba;
public final class y0 implements TextureView.SurfaceTextureListener {
    public final ba f49422a;
    public final c1 f49423b;

    public y0(c1 c1Var, ba baVar) {
        this.f49423b = c1Var;
        this.f49422a = baVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        if (surfaceTexture != null) {
            c1 c1Var = this.f49423b;
            if (c1Var.d == null) {
                a1 a1Var = new a1(c1Var, surfaceTexture, this.f49422a);
                c1Var.d = a1Var;
                a1Var.f49164n = i9;
                a1Var.f49165r = i10;
                c1Var.i();
                c1Var.post(new x0(this, 1));
                q0 q0Var = c1Var.f49180c;
                if (q0Var.v) {
                    q0Var.f49314f.f(new n0(q0Var, q0Var.f49329w, 0));
                    q0Var.f49329w = null;
                    q0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c1 c1Var = this.f49423b;
        if (c1Var.d != null && !c1Var.f49188y) {
            q0 q0Var = c1Var.f49180c;
            q0Var.f49314f.f(new o0(0, q0Var, new x0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        c1 c1Var = this.f49423b;
        a1 a1Var = c1Var.d;
        if (a1Var == null) {
            return;
        }
        a1Var.f49164n = i9;
        a1Var.f49165r = i10;
        c1Var.i();
        a1 a1Var2 = c1Var.d;
        a1Var2.postRunnable(a1Var2.f49167w);
        c1Var.d.postRunnable(new x0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
