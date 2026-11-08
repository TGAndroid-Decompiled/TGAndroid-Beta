package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
public final class s50 implements TextureView.SurfaceTextureListener {
    public final int f49634a;
    public final org.telegram.messenger.ls f49635b;

    public s50(org.telegram.messenger.ls lsVar, int i7) {
        this.f49634a = i7;
        this.f49635b = lsVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f49634a) {
            case 0:
                u50 u50Var = (u50) this.f49635b;
                if (u50Var.I == null && surfaceTexture != null) {
                    u50Var.I = new t50(u50Var, surfaceTexture);
                    Intro.onSurfaceChanged(i7, i10, Math.min(i7 / 150.0f, i10 / 150.0f), 0);
                    u50Var.I.postRunnable(new hz(this, 12));
                    t50 t50Var = u50Var.I;
                    t50Var.postRunnable(t50Var.f49938x);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f49634a) {
            case 0:
                u50 u50Var = (u50) this.f49635b;
                t50 t50Var = u50Var.I;
                if (t50Var != null) {
                    t50Var.postRunnable(new hz(t50Var, 14));
                    u50Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f49635b;
                TextureView textureView = photoViewer.B2;
                if (textureView != null && photoViewer.E3) {
                    if (photoViewer.K3) {
                        photoViewer.F3 = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    photoViewer.B2.setVisibility(0);
                    photoViewer.E3 = false;
                    photoViewer.f41384e0.invalidate();
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f49634a) {
            case 0:
                if (((u50) this.f49635b).I != null) {
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
        switch (this.f49634a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f49635b;
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
