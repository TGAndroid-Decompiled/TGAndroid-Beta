package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class w70 implements TextureView.SurfaceTextureListener {
    public final int f38551a;
    public final NotificationCenter.NotificationCenterDelegate f38552b;

    public w70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38551a = i10;
        this.f38552b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38551a) {
            case 0:
                a80 a80Var = (a80) this.f38552b;
                if (a80Var.I == null && surfaceTexture != null) {
                    a80Var.I = new y70(a80Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    a80Var.I.postRunnable(new d10(this, 11));
                    y70 y70Var = a80Var.I;
                    y70Var.postRunnable(y70Var.f39747w);
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
        switch (this.f38551a) {
            case 0:
                a80 a80Var = (a80) this.f38552b;
                y70 y70Var = a80Var.I;
                if (y70Var != null) {
                    y70Var.postRunnable(new d10(y70Var, 13));
                    a80Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38552b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.eg0 eg0Var = org.telegram.ui.Components.eg0.f23661p0;
                    if (eg0Var.P && org.telegram.ui.Components.eg0.p() != null && org.telegram.ui.Components.eg0.p().f40745b.f42180a != 0) {
                        TextureView textureView2 = null;
                        if (eg0Var != null) {
                            textureView = eg0Var.f23677l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (eg0Var != null) {
                            textureView2 = eg0Var.f23677l0;
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
                        photoViewer.f30908e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38551a) {
            case 0:
                if (((a80) this.f38552b).I != null) {
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
        switch (this.f38551a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38552b;
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
