package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class y2 extends VideoPlayerHolderBase {
    public final z2 f42009a;

    public y2(z2 z2Var) {
        this.f42009a = z2Var;
    }

    @Override
    public final boolean needRepeat() {
        return true;
    }

    @Override
    public final void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
        if (!this.firstFrameRendered) {
            this.firstFrameRendered = true;
            z2 z2Var = this.f42009a;
            z2Var.f42462n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = z2Var.L;
            if (pageblockvideo != null) {
                z70 z70Var = z2Var.f42458a;
                a0.h hVar = z70Var.f42509y;
                long j10 = pageblockvideo.video_id;
                a3 a2 = a3.a(z70Var.f42507w, z2Var);
                z2Var.c(a2);
                hVar.k(a2, j10);
            }
        }
    }
}
