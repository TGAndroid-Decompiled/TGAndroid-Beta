package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class s70 implements TextureView.SurfaceTextureListener {
    public final int f41149a;
    public final NotificationCenter.NotificationCenterDelegate f41150b;

    public s70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f41149a = i10;
        this.f41150b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f41149a) {
            case 0:
                v70 v70Var = (v70) this.f41150b;
                if (v70Var.F == null && surfaceTexture != null) {
                    v70Var.F = new u70(v70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    v70Var.F.postRunnable(new c10(this, 11));
                    u70 u70Var = v70Var.F;
                    u70Var.postRunnable(u70Var.f41817w);
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
        switch (this.f41149a) {
            case 0:
                v70 v70Var = (v70) this.f41150b;
                u70 u70Var = v70Var.F;
                if (u70Var != null) {
                    u70Var.postRunnable(new c10(u70Var, 13));
                    v70Var.F = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f41150b;
                if (photoViewer.f34442y2 != null) {
                    org.telegram.ui.Components.ng0 ng0Var = org.telegram.ui.Components.ng0.m0;
                    if (ng0Var.M && org.telegram.ui.Components.ng0.p() != null && org.telegram.ui.Components.ng0.p().f2492b.f5036a != 0) {
                        TextureView textureView2 = null;
                        if (ng0Var != null) {
                            textureView = ng0Var.f29498i0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (ng0Var != null) {
                            textureView2 = ng0Var.f29498i0;
                        }
                        textureView2.setVisibility(0);
                        return false;
                    } else if (photoViewer.C3) {
                        if (photoViewer.I3) {
                            photoViewer.D3 = 2;
                        }
                        photoViewer.f34442y2.setSurfaceTexture(surfaceTexture);
                        photoViewer.f34442y2.setVisibility(0);
                        photoViewer.C3 = false;
                        photoViewer.f34230b0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f41149a) {
            case 0:
                if (((v70) this.f41150b).F != null) {
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
        switch (this.f41149a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f41150b;
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
