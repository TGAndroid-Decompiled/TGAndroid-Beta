package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class t70 implements TextureView.SurfaceTextureListener {
    public final int f38404a;
    public final NotificationCenter.NotificationCenterDelegate f38405b;

    public t70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38404a = i10;
        this.f38405b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38404a) {
            case 0:
                w70 w70Var = (w70) this.f38405b;
                if (w70Var.F == null && surfaceTexture != null) {
                    w70Var.F = new v70(w70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    w70Var.F.postRunnable(new d10(this, 11));
                    v70 v70Var = w70Var.F;
                    v70Var.postRunnable(v70Var.f39021w);
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
        switch (this.f38404a) {
            case 0:
                w70 w70Var = (w70) this.f38405b;
                v70 v70Var = w70Var.F;
                if (v70Var != null) {
                    v70Var.postRunnable(new d10(v70Var, 13));
                    w70Var.F = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38405b;
                if (photoViewer.f31890y2 != null) {
                    org.telegram.ui.Components.mg0 mg0Var = org.telegram.ui.Components.mg0.m0;
                    if (mg0Var.M && org.telegram.ui.Components.mg0.p() != null && org.telegram.ui.Components.mg0.p().f1818b.f4334a != 0) {
                        TextureView textureView2 = null;
                        if (mg0Var != null) {
                            textureView = mg0Var.f27049i0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (mg0Var != null) {
                            textureView2 = mg0Var.f27049i0;
                        }
                        textureView2.setVisibility(0);
                        return false;
                    } else if (photoViewer.C3) {
                        if (photoViewer.I3) {
                            photoViewer.D3 = 2;
                        }
                        photoViewer.f31890y2.setSurfaceTexture(surfaceTexture);
                        photoViewer.f31890y2.setVisibility(0);
                        photoViewer.C3 = false;
                        photoViewer.f31679b0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38404a) {
            case 0:
                if (((w70) this.f38405b).F != null) {
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
        switch (this.f38404a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38405b;
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
