package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class z41 implements org.telegram.ui.Components.c71, org.telegram.ui.Components.y61 {
    public final a51 f39960a;

    public z41(a51 a51Var) {
        this.f39960a = a51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f39960a.V.f25540i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        a51 a51Var = this.f39960a;
        if (i10 == 4) {
            a51Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(a51Var.Z);
        AndroidUtilities.runOnUIThread(a51Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f39960a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new xz0(this, 12));
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
    public void onError(org.telegram.ui.Components.f71 f71Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
