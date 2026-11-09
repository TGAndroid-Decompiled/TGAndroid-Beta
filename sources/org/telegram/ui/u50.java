package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
public final class u50 implements TextureView.SurfaceTextureListener {
    public final int f50292a;
    public final org.telegram.messenger.ls f50293b;

    public u50(org.telegram.messenger.ls lsVar, int i7) {
        this.f50292a = i7;
        this.f50293b = lsVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f50292a) {
            case 0:
                w50 w50Var = (w50) this.f50293b;
                if (w50Var.I == null && surfaceTexture != null) {
                    w50Var.I = new v50(w50Var, surfaceTexture);
                    Intro.onSurfaceChanged(i7, i10, Math.min(i7 / 150.0f, i10 / 150.0f), 0);
                    w50Var.I.postRunnable(new jz(this, 12));
                    v50 v50Var = w50Var.I;
                    v50Var.postRunnable(v50Var.f50578x);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f50292a) {
            case 0:
                w50 w50Var = (w50) this.f50293b;
                v50 v50Var = w50Var.I;
                if (v50Var != null) {
                    v50Var.postRunnable(new jz(v50Var, 14));
                    w50Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f50293b;
                TextureView textureView = photoViewer.B2;
                if (textureView != null && photoViewer.E3) {
                    if (photoViewer.K3) {
                        photoViewer.F3 = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    photoViewer.B2.setVisibility(0);
                    photoViewer.E3 = false;
                    photoViewer.f41391e0.invalidate();
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f50292a) {
            case 0:
                if (((w50) this.f50293b).I != null) {
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
        switch (this.f50292a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f50293b;
                if (photoViewer.F3 == 1) {
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
