package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class y70 implements TextureView.SurfaceTextureListener {
    public final int f44275a;
    public final NotificationCenter.NotificationCenterDelegate f44276b;

    public y70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f44275a = i10;
        this.f44276b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f44275a) {
            case 0:
                c80 c80Var = (c80) this.f44276b;
                if (c80Var.I == null && surfaceTexture != null) {
                    c80Var.I = new a80(c80Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    c80Var.I.postRunnable(new tz(this, 12));
                    a80 a80Var = c80Var.I;
                    a80Var.postRunnable(a80Var.f35926w);
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
        switch (this.f44275a) {
            case 0:
                c80 c80Var = (c80) this.f44276b;
                a80 a80Var = c80Var.I;
                if (a80Var != null) {
                    a80Var.postRunnable(new tz(a80Var, 14));
                    c80Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f44276b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.ih0 ih0Var = org.telegram.ui.Components.ih0.f27325p0;
                    if (ih0Var.P && org.telegram.ui.Components.ih0.p() != null && org.telegram.ui.Components.ih0.p().f46241b.f48070a != 0) {
                        TextureView textureView2 = null;
                        if (ih0Var != null) {
                            textureView = ih0Var.f27342l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (ih0Var != null) {
                            textureView2 = ih0Var.f27342l0;
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
                        photoViewer.f33932e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f44275a) {
            case 0:
                if (((c80) this.f44276b).I != null) {
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
        switch (this.f44275a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f44276b;
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
