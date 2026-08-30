package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class y2 extends VideoPlayerHolderBase {
    public final z2 f40358a;

    public y2(z2 z2Var) {
        this.f40358a = z2Var;
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
            z2 z2Var = this.f40358a;
            z2Var.f40644n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = z2Var.I;
            if (pageblockvideo != null) {
                n70 n70Var = z2Var.f40640a;
                a0.h hVar = n70Var.f36484y;
                long j10 = pageblockvideo.video_id;
                a3 a2 = a3.a(n70Var.f36482w, z2Var);
                z2Var.c(a2);
                hVar.k(a2, j10);
            }
        }
    }
}
