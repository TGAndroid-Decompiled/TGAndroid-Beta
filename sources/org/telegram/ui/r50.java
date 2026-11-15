package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
public final class r50 implements TextureView.SurfaceTextureListener {
    public final int f50846a;
    public final org.telegram.messenger.is f50847b;

    public r50(org.telegram.messenger.is isVar, int i7) {
        this.f50846a = i7;
        this.f50847b = isVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f50846a) {
            case 0:
                t50 t50Var = (t50) this.f50847b;
                if (t50Var.J == null && surfaceTexture != null) {
                    t50Var.J = new s50(t50Var, surfaceTexture);
                    Intro.onSurfaceChanged(i7, i10, Math.min(i7 / 150.0f, i10 / 150.0f), 0);
                    t50Var.J.postRunnable(new iz(this, 12));
                    s50 s50Var = t50Var.J;
                    s50Var.postRunnable(s50Var.f51109x);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f50846a) {
            case 0:
                t50 t50Var = (t50) this.f50847b;
                s50 s50Var = t50Var.J;
                if (s50Var != null) {
                    s50Var.postRunnable(new iz(s50Var, 14));
                    t50Var.J = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f50847b;
                TextureView textureView = photoViewer.C2;
                if (textureView != null && photoViewer.F3) {
                    if (photoViewer.L3) {
                        photoViewer.G3 = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    photoViewer.C2.setVisibility(0);
                    photoViewer.F3 = false;
                    photoViewer.f42763f0.invalidate();
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f50846a) {
            case 0:
                if (((t50) this.f50847b).J != null) {
                    Intro.onSurfaceChanged(i7, i10, Math.min(i7 / 150.0f, i10 / 150.0f), 0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f50846a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f50847b;
                if (photoViewer.G3 == 1) {
                    photoViewer.q0(true);
                    return;
                }
                return;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i7, int i10) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i7, int i10) {
    }
}
