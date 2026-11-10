package org.telegram.ui;

import android.graphics.SurfaceTexture;
public final class uz0 implements org.telegram.ui.Components.q51, org.telegram.ui.Components.m51 {
    public final vz0 f50597a;

    public uz0(vz0 vz0Var) {
        this.f50597a = vz0Var;
    }

    @Override
    public void F(boolean z9, float[] fArr) {
        this.f50597a.V.e(z9, fArr);
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z9, int i7) {
        vz0 vz0Var = this.f50597a;
        if (i7 == 4) {
            vz0Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.r(vz0Var.Z);
        org.telegram.messenger.g0.i3(vz0Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean s() {
        if (this.f50597a.V.f32149i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.h3(new uu0(this, 14));
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
    public void onError(org.telegram.ui.Components.t51 t51Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
