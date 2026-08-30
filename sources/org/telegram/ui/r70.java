package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class r70 implements TextureView.SurfaceTextureListener {
    public final int f37932a;
    public final NotificationCenter.NotificationCenterDelegate f37933b;

    public r70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f37932a = i10;
        this.f37933b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f37932a) {
            case 0:
                u70 u70Var = (u70) this.f37933b;
                if (u70Var.F == null && surfaceTexture != null) {
                    u70Var.F = new t70(u70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    u70Var.F.postRunnable(new c10(this, 11));
                    t70 t70Var = u70Var.F;
                    t70Var.postRunnable(t70Var.f38570w);
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
        switch (this.f37932a) {
            case 0:
                u70 u70Var = (u70) this.f37933b;
                t70 t70Var = u70Var.F;
                if (t70Var != null) {
                    t70Var.postRunnable(new c10(t70Var, 13));
                    u70Var.F = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f37933b;
                if (photoViewer.f31916y2 != null) {
                    org.telegram.ui.Components.lg0 lg0Var = org.telegram.ui.Components.lg0.m0;
                    if (lg0Var.M && org.telegram.ui.Components.lg0.p() != null && org.telegram.ui.Components.lg0.p().f2296b.f5196a != 0) {
                        TextureView textureView2 = null;
                        if (lg0Var != null) {
                            textureView = lg0Var.f26670i0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (lg0Var != null) {
                            textureView2 = lg0Var.f26670i0;
                        }
                        textureView2.setVisibility(0);
                        return false;
                    } else if (photoViewer.C3) {
                        if (photoViewer.I3) {
                            photoViewer.D3 = 2;
                        }
                        photoViewer.f31916y2.setSurfaceTexture(surfaceTexture);
                        photoViewer.f31916y2.setVisibility(0);
                        photoViewer.C3 = false;
                        photoViewer.f31705b0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f37932a) {
            case 0:
                if (((u70) this.f37933b).F != null) {
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
        switch (this.f37932a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f37933b;
                if (photoViewer.D3 == 1) {
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
