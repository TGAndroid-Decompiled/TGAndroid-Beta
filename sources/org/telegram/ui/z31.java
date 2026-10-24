package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class z31 implements org.telegram.ui.Components.g81, org.telegram.ui.Components.c81 {
    public final a41 f44018a;

    public z31(a41 a41Var) {
        this.f44018a = a41Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f44018a.V.f27609i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        a41 a41Var = this.f44018a;
        if (i10 == 4) {
            a41Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(a41Var.Z);
        AndroidUtilities.runOnUIThread(a41Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f44018a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new ly0(this, 14));
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(org.telegram.ui.Components.j81 j81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
