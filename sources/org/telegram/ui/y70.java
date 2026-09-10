package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class y70 implements TextureView.SurfaceTextureListener {
    public final int f38931a;
    public final NotificationCenter.NotificationCenterDelegate f38932b;

    public y70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38931a = i10;
        this.f38932b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38931a) {
            case 0:
                c80 c80Var = (c80) this.f38932b;
                if (c80Var.I == null && surfaceTexture != null) {
                    c80Var.I = new a80(c80Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    c80Var.I.postRunnable(new i10(this, 11));
                    a80 a80Var = c80Var.I;
                    a80Var.postRunnable(a80Var.f30832w);
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
        switch (this.f38931a) {
            case 0:
                c80 c80Var = (c80) this.f38932b;
                a80 a80Var = c80Var.I;
                if (a80Var != null) {
                    a80Var.postRunnable(new i10(a80Var, 13));
                    c80Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38932b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.og0 og0Var = org.telegram.ui.Components.og0.f25781p0;
                    if (og0Var.P && org.telegram.ui.Components.og0.p() != null && org.telegram.ui.Components.og0.p().f39920b.f41439a != 0) {
                        TextureView textureView2 = null;
                        if (og0Var != null) {
                            textureView = og0Var.f25797l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (og0Var != null) {
                            textureView2 = og0Var.f25797l0;
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
                        photoViewer.f30049e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38931a) {
            case 0:
                if (((c80) this.f38932b).I != null) {
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
        switch (this.f38931a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38932b;
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
