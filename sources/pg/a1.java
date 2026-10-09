package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ma;
import org.telegram.ui.web.w1;
public final class a1 implements TextureView.SurfaceTextureListener {
    public final ma f45586a;
    public final e1 f45587b;

    public a1(e1 e1Var, ma maVar) {
        this.f45587b = e1Var;
        this.f45586a = maVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            e1 e1Var = this.f45587b;
            if (e1Var.d == null) {
                c1 c1Var = new c1(e1Var, surfaceTexture, this.f45586a);
                e1Var.d = c1Var;
                c1Var.f45603n = i10;
                c1Var.f45604r = i11;
                e1Var.i();
                e1Var.post(new z0(this, 1));
                s0 s0Var = e1Var.f45635c;
                if (s0Var.v) {
                    s0Var.f45759f.f(new q0(s0Var, s0Var.f45774w, 0));
                    s0Var.f45774w = null;
                    s0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e1 e1Var = this.f45587b;
        if (e1Var.d != null && !e1Var.f45643y) {
            s0 s0Var = e1Var.f45635c;
            s0Var.f45759f.f(new w1(4, s0Var, new z0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e1 e1Var = this.f45587b;
        c1 c1Var = e1Var.d;
        if (c1Var == null) {
            return;
        }
        c1Var.f45603n = i10;
        c1Var.f45604r = i11;
        e1Var.i();
        c1 c1Var2 = e1Var.d;
        c1Var2.postRunnable(c1Var2.f45606w);
        e1Var.d.postRunnable(new z0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
