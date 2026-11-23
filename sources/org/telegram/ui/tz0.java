package org.telegram.ui;

import android.graphics.SurfaceTexture;
public final class tz0 implements org.telegram.ui.Components.g61, org.telegram.ui.Components.c61 {
    public final uz0 f52419a;

    public tz0(uz0 uz0Var) {
        this.f52419a = uz0Var;
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        uz0 uz0Var = this.f52419a;
        if (i7 == 4) {
            uz0Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.r(uz0Var.f52658a0);
        org.telegram.messenger.g0.h3(uz0Var.f52658a0, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean t() {
        if (this.f52419a.W.f35457i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void x(boolean z10, float[] fArr) {
        this.f52419a.W.e(z10, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.g3(new ru0(this, 14));
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
    public void onError(org.telegram.ui.Components.i61 i61Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
