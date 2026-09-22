package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class z70 implements TextureView.SurfaceTextureListener {
    public final int f40154a;
    public final NotificationCenter.NotificationCenterDelegate f40155b;

    public z70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f40154a = i10;
        this.f40155b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f40154a) {
            case 0:
                d80 d80Var = (d80) this.f40155b;
                if (d80Var.I == null && surfaceTexture != null) {
                    d80Var.I = new b80(d80Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    d80Var.I.postRunnable(new g10(this, 11));
                    b80 b80Var = d80Var.I;
                    b80Var.postRunnable(b80Var.f32304w);
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
        switch (this.f40154a) {
            case 0:
                d80 d80Var = (d80) this.f40155b;
                b80 b80Var = d80Var.I;
                if (b80Var != null) {
                    b80Var.postRunnable(new g10(b80Var, 13));
                    d80Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f40155b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.rg0 rg0Var = org.telegram.ui.Components.rg0.f27960p0;
                    if (rg0Var.P && org.telegram.ui.Components.rg0.p() != null && org.telegram.ui.Components.rg0.p().f41110b.f42548a != 0) {
                        TextureView textureView2 = null;
                        if (rg0Var != null) {
                            textureView = rg0Var.f27976l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (rg0Var != null) {
                            textureView2 = rg0Var.f27976l0;
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
                        photoViewer.f31242e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f40154a) {
            case 0:
                if (((d80) this.f40155b).I != null) {
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
        switch (this.f40154a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f40155b;
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
