package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
public final class v50 implements TextureView.SurfaceTextureListener {
    public final int f50633a;
    public final org.telegram.messenger.ls f50634b;

    public v50(org.telegram.messenger.ls lsVar, int i7) {
        this.f50633a = i7;
        this.f50634b = lsVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f50633a) {
            case 0:
                x50 x50Var = (x50) this.f50634b;
                if (x50Var.I == null && surfaceTexture != null) {
                    x50Var.I = new w50(x50Var, surfaceTexture);
                    Intro.onSurfaceChanged(i7, i10, Math.min(i7 / 150.0f, i10 / 150.0f), 0);
                    x50Var.I.postRunnable(new kz(this, 12));
                    w50 w50Var = x50Var.I;
                    w50Var.postRunnable(w50Var.f50917x);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f50633a) {
            case 0:
                x50 x50Var = (x50) this.f50634b;
                w50 w50Var = x50Var.I;
                if (w50Var != null) {
                    w50Var.postRunnable(new kz(w50Var, 14));
                    x50Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f50634b;
                TextureView textureView = photoViewer.B2;
                if (textureView != null && photoViewer.E3) {
                    if (photoViewer.K3) {
                        photoViewer.F3 = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    photoViewer.B2.setVisibility(0);
                    photoViewer.E3 = false;
                    photoViewer.f41382e0.invalidate();
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f50633a) {
            case 0:
                if (((x50) this.f50634b).I != null) {
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
        switch (this.f50633a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f50634b;
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
