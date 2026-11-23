package org.telegram.ui;

import android.graphics.SurfaceTexture;
public final class rz0 implements org.telegram.ui.Components.f61, org.telegram.ui.Components.b61 {
    public final sz0 f51926a;

    public rz0(sz0 sz0Var) {
        this.f51926a = sz0Var;
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        sz0 sz0Var = this.f51926a;
        if (i7 == 4) {
            sz0Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.r(sz0Var.f52177a0);
        org.telegram.messenger.g0.h3(sz0Var.f52177a0, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean r() {
        if (this.f51926a.W.f35046i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void w(boolean z10, float[] fArr) {
        this.f51926a.W.e(z10, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.g3(new qu0(this, 14));
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(org.telegram.ui.Components.h61 h61Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
