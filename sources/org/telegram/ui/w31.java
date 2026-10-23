package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class w31 implements org.telegram.ui.Components.z71, org.telegram.ui.Components.v71 {
    public final x31 f42463a;

    public w31(x31 x31Var) {
        this.f42463a = x31Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f42463a.V.f28106i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        x31 x31Var = this.f42463a;
        if (i10 == 4) {
            x31Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(x31Var.Z);
        AndroidUtilities.runOnUIThread(x31Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f42463a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new qy0(this, 13));
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
    public void onError(org.telegram.ui.Components.c81 c81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
