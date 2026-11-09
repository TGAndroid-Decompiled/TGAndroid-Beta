package org.telegram.ui;

import android.graphics.SurfaceTexture;
public final class tz0 implements org.telegram.ui.Components.r51, org.telegram.ui.Components.n51 {
    public final uz0 f50269a;

    public tz0(uz0 uz0Var) {
        this.f50269a = uz0Var;
    }

    @Override
    public void F(boolean z9, float[] fArr) {
        this.f50269a.V.e(z9, fArr);
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z9, int i7) {
        uz0 uz0Var = this.f50269a;
        if (i7 == 4) {
            uz0Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.r(uz0Var.Z);
        org.telegram.messenger.g0.i3(uz0Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean s() {
        if (this.f50269a.V.f32573i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.h3(new tu0(this, 14));
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
    public void onError(org.telegram.ui.Components.u51 u51Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
