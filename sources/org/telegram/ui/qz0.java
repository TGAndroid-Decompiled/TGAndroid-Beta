package org.telegram.ui;

import android.graphics.SurfaceTexture;
public final class qz0 implements org.telegram.ui.Components.p51, org.telegram.ui.Components.l51 {
    public final rz0 f49337a;

    public qz0(rz0 rz0Var) {
        this.f49337a = rz0Var;
    }

    @Override
    public void F(boolean z9, float[] fArr) {
        this.f49337a.V.e(z9, fArr);
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z9, int i7) {
        rz0 rz0Var = this.f49337a;
        if (i7 == 4) {
            rz0Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.r(rz0Var.Z);
        org.telegram.messenger.g0.i3(rz0Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean s() {
        if (this.f49337a.V.f32458i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.h3(new ru0(this, 14));
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
    public void onError(org.telegram.ui.Components.s51 s51Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
