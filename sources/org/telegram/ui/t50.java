package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
public final class t50 implements TextureView.SurfaceTextureListener {
    public final int f52227a;
    public final org.telegram.messenger.fs f52228b;

    public t50(org.telegram.messenger.fs fsVar, int i7) {
        this.f52227a = i7;
        this.f52228b = fsVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f52227a) {
            case 0:
                v50 v50Var = (v50) this.f52228b;
                if (v50Var.J == null && surfaceTexture != null) {
                    v50Var.J = new u50(v50Var, surfaceTexture);
                    Intro.onSurfaceChanged(i7, i10, Math.min(i7 / 150.0f, i10 / 150.0f), 0);
                    v50Var.J.postRunnable(new lz(this, 12));
                    u50 u50Var = v50Var.J;
                    u50Var.postRunnable(u50Var.f52450x);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f52227a) {
            case 0:
                v50 v50Var = (v50) this.f52228b;
                u50 u50Var = v50Var.J;
                if (u50Var != null) {
                    u50Var.postRunnable(new lz(u50Var, 14));
                    v50Var.J = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f52228b;
                TextureView textureView = photoViewer.C2;
                if (textureView != null && photoViewer.F3) {
                    if (photoViewer.L3) {
                        photoViewer.G3 = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    photoViewer.C2.setVisibility(0);
                    photoViewer.F3 = false;
                    photoViewer.f43249f0.invalidate();
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f52227a) {
            case 0:
                if (((v50) this.f52228b).J != null) {
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
        switch (this.f52227a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f52228b;
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
