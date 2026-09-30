package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class u70 implements TextureView.SurfaceTextureListener {
    public final int f38427a;
    public final NotificationCenter.NotificationCenterDelegate f38428b;

    public u70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38427a = i10;
        this.f38428b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38427a) {
            case 0:
                y70 y70Var = (y70) this.f38428b;
                if (y70Var.I == null && surfaceTexture != null) {
                    y70Var.I = new w70(y70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    y70Var.I.postRunnable(new c10(this, 11));
                    w70 w70Var = y70Var.I;
                    w70Var.postRunnable(w70Var.f39010w);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        switch (this.f38427a) {
            case 0:
                y70 y70Var = (y70) this.f38428b;
                w70 w70Var = y70Var.I;
                if (w70Var != null) {
                    w70Var.postRunnable(new c10(w70Var, 13));
                    y70Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38428b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.rg0 rg0Var = org.telegram.ui.Components.rg0.f27987p0;
                    if (rg0Var.P && org.telegram.ui.Components.rg0.p() != null && org.telegram.ui.Components.rg0.p().f41160b.f42618a != 0) {
                        TextureView textureView2 = null;
                        if (rg0Var != null) {
                            textureView = rg0Var.f28003l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (rg0Var != null) {
                            textureView2 = rg0Var.f28003l0;
                        }
                        textureView2.setVisibility(0);
                        return false;
                    } else if (photoViewer.F3) {
                        if (photoViewer.L3) {
                            photoViewer.G3 = 2;
                        }
                        photoViewer.B2.setSurfaceTexture(surfaceTexture);
                        photoViewer.B2.setVisibility(0);
                        photoViewer.F3 = false;
                        photoViewer.f31297e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38427a) {
            case 0:
                if (((y70) this.f38428b).I != null) {
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f38427a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38428b;
                if (photoViewer.G3 == 1) {
                    photoViewer.x0(true);
                    return;
                }
                return;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
