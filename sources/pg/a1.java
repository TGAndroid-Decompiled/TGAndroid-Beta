package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.la;
import org.telegram.ui.web.f2;
public final class a1 implements TextureView.SurfaceTextureListener {
    public final la f45654a;
    public final e1 f45655b;

    public a1(e1 e1Var, la laVar) {
        this.f45655b = e1Var;
        this.f45654a = laVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            e1 e1Var = this.f45655b;
            if (e1Var.d == null) {
                c1 c1Var = new c1(e1Var, surfaceTexture, this.f45654a);
                e1Var.d = c1Var;
                c1Var.f45671n = i10;
                c1Var.f45672r = i11;
                e1Var.i();
                e1Var.post(new z0(this, 1));
                s0 s0Var = e1Var.f45703c;
                if (s0Var.v) {
                    s0Var.f45827f.f(new q0(s0Var, s0Var.f45842w, 0));
                    s0Var.f45842w = null;
                    s0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e1 e1Var = this.f45655b;
        if (e1Var.d != null && !e1Var.f45711y) {
            s0 s0Var = e1Var.f45703c;
            s0Var.f45827f.f(new f2(3, s0Var, new z0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e1 e1Var = this.f45655b;
        c1 c1Var = e1Var.d;
        if (c1Var == null) {
            return;
        }
        c1Var.f45671n = i10;
        c1Var.f45672r = i11;
        e1Var.i();
        c1 c1Var2 = e1Var.d;
        c1Var2.postRunnable(c1Var2.f45674w);
        e1Var.d.postRunnable(new z0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
