package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class y70 implements TextureView.SurfaceTextureListener {
    public final int f44270a;
    public final NotificationCenter.NotificationCenterDelegate f44271b;

    public y70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f44270a = i10;
        this.f44271b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f44270a) {
            case 0:
                d80 d80Var = (d80) this.f44271b;
                if (d80Var.I == null && surfaceTexture != null) {
                    d80Var.I = new b80(d80Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    d80Var.I.postRunnable(new uz(this, 12));
                    b80 b80Var = d80Var.I;
                    b80Var.postRunnable(b80Var.f36167w);
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
        switch (this.f44270a) {
            case 0:
                d80 d80Var = (d80) this.f44271b;
                b80 b80Var = d80Var.I;
                if (b80Var != null) {
                    b80Var.postRunnable(new uz(b80Var, 14));
                    d80Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f44271b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.gh0 gh0Var = org.telegram.ui.Components.gh0.f26700p0;
                    if (gh0Var.P && org.telegram.ui.Components.gh0.p() != null && org.telegram.ui.Components.gh0.p().f46161b.f47978a != 0) {
                        TextureView textureView2 = null;
                        if (gh0Var != null) {
                            textureView = gh0Var.f26717l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (gh0Var != null) {
                            textureView2 = gh0Var.f26717l0;
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
                        photoViewer.f33904e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f44270a) {
            case 0:
                if (((d80) this.f44271b).I != null) {
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
        switch (this.f44270a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f44271b;
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
