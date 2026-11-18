package org.telegram.ui;

import android.graphics.SurfaceTexture;
public final class sz0 implements org.telegram.ui.Components.d61, org.telegram.ui.Components.z51 {
    public final tz0 f52115a;

    public sz0(tz0 tz0Var) {
        this.f52115a = tz0Var;
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        tz0 tz0Var = this.f52115a;
        if (i7 == 4) {
            tz0Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.r(tz0Var.f52383a0);
        org.telegram.messenger.g0.h3(tz0Var.f52383a0, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean t() {
        if (this.f52115a.W.f35806i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void x(boolean z10, float[] fArr) {
        this.f52115a.W.e(z10, fArr);
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
    public void onError(org.telegram.ui.Components.f61 f61Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
