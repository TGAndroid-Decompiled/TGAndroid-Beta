package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class x70 implements TextureView.SurfaceTextureListener {
    public final int f39549a;
    public final NotificationCenter.NotificationCenterDelegate f39550b;

    public x70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f39549a = i10;
        this.f39550b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f39549a) {
            case 0:
                b80 b80Var = (b80) this.f39550b;
                if (b80Var.I == null && surfaceTexture != null) {
                    b80Var.I = new z70(b80Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    b80Var.I.postRunnable(new f10(this, 11));
                    z70 z70Var = b80Var.I;
                    z70Var.postRunnable(z70Var.f40421w);
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
        switch (this.f39549a) {
            case 0:
                b80 b80Var = (b80) this.f39550b;
                z70 z70Var = b80Var.I;
                if (z70Var != null) {
                    z70Var.postRunnable(new f10(z70Var, 13));
                    b80Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f39550b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.rg0 rg0Var = org.telegram.ui.Components.rg0.f27977p0;
                    if (rg0Var.P && org.telegram.ui.Components.rg0.p() != null && org.telegram.ui.Components.rg0.p().f41059b.f42558a != 0) {
                        TextureView textureView2 = null;
                        if (rg0Var != null) {
                            textureView = rg0Var.f27993l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (rg0Var != null) {
                            textureView2 = rg0Var.f27993l0;
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
                        photoViewer.f31225e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f39549a) {
            case 0:
                if (((b80) this.f39550b).I != null) {
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
        switch (this.f39549a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f39550b;
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
