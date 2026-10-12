package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class w2 extends VideoPlayerHolderBase {
    public final x2 f43027a;

    public w2(x2 x2Var) {
        this.f43027a = x2Var;
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
            x2 x2Var = this.f43027a;
            x2Var.f43736n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = x2Var.L;
            if (pageblockvideo != null) {
                w70 w70Var = x2Var.f43731a;
                a0.i iVar = w70Var.f43078y;
                long j3 = pageblockvideo.video_id;
                y2 a2 = y2.a(w70Var.f43076w, x2Var);
                x2Var.c(a2);
                iVar.k(a2, j3);
            }
        }
    }
}
