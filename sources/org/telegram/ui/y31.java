package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class y31 implements org.telegram.ui.Components.x71, org.telegram.ui.Components.t71 {
    public final z31 f43345a;

    public y31(z31 z31Var) {
        this.f43345a = z31Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f43345a.V.f28157i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        z31 z31Var = this.f43345a;
        if (i10 == 4) {
            z31Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(z31Var.Z);
        AndroidUtilities.runOnUIThread(z31Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f43345a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new sy0(this, 13));
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
    public void onError(org.telegram.ui.Components.a81 a81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
