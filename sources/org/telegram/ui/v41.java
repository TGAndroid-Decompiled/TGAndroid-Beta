package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class v41 implements org.telegram.ui.Components.g71, org.telegram.ui.Components.c71 {
    public final w41 f42010a;

    public v41(w41 w41Var) {
        this.f42010a = w41Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f42010a.S.f26217i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        w41 w41Var = this.f42010a;
        if (i10 == 4) {
            w41Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(w41Var.W);
        AndroidUtilities.runOnUIThread(w41Var.W, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z4, boolean z10, float[] fArr) {
        this.f42010a.S.e(z4, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new sz0(this, 12));
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(org.telegram.ui.Components.j71 j71Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
