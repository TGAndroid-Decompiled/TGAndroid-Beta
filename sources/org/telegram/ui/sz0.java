package org.telegram.ui;

import android.graphics.SurfaceTexture;
public final class sz0 implements org.telegram.ui.Components.g61, org.telegram.ui.Components.c61 {
    public final tz0 f52117a;

    public sz0(tz0 tz0Var) {
        this.f52117a = tz0Var;
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        tz0 tz0Var = this.f52117a;
        if (i7 == 4) {
            tz0Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.r(tz0Var.f52384a0);
        org.telegram.messenger.g0.h3(tz0Var.f52384a0, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean t() {
        if (this.f52117a.W.f35419i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void x(boolean z10, float[] fArr) {
        this.f52117a.W.e(z10, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.g3(new su0(this, 14));
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
