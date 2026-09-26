package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class u70 implements TextureView.SurfaceTextureListener {
    public final int f38336a;
    public final NotificationCenter.NotificationCenterDelegate f38337b;

    public u70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38336a = i10;
        this.f38337b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38336a) {
            case 0:
                y70 y70Var = (y70) this.f38337b;
                if (y70Var.I == null && surfaceTexture != null) {
                    y70Var.I = new w70(y70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    y70Var.I.postRunnable(new c10(this, 11));
                    w70 w70Var = y70Var.I;
                    w70Var.postRunnable(w70Var.f38921w);
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
        switch (this.f38336a) {
            case 0:
                y70 y70Var = (y70) this.f38337b;
                w70 w70Var = y70Var.I;
                if (w70Var != null) {
                    w70Var.postRunnable(new c10(w70Var, 13));
                    y70Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38337b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.pg0 pg0Var = org.telegram.ui.Components.pg0.f27353p0;
                    if (pg0Var.P && org.telegram.ui.Components.pg0.p() != null && org.telegram.ui.Components.pg0.p().f41060b.f42512a != 0) {
                        TextureView textureView2 = null;
                        if (pg0Var != null) {
                            textureView = pg0Var.f27369l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (pg0Var != null) {
                            textureView2 = pg0Var.f27369l0;
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
                        photoViewer.f31222e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38336a) {
            case 0:
                if (((y70) this.f38337b).I != null) {
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
        switch (this.f38336a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38337b;
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
