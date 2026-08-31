package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class y2 extends VideoPlayerHolderBase {
    public final z2 f43521a;

    public y2(z2 z2Var) {
        this.f43521a = z2Var;
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
            z2 z2Var = this.f43521a;
            z2Var.f43788n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = z2Var.I;
            if (pageblockvideo != null) {
                o70 o70Var = z2Var.f43783a;
                a0.h hVar = o70Var.f39618y;
                long j10 = pageblockvideo.video_id;
                a3 a2 = a3.a(o70Var.f39616w, z2Var);
                z2Var.c(a2);
                hVar.k(a2, j10);
            }
        }
    }
}
