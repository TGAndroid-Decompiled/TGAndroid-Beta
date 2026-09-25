package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class w2 extends VideoPlayerHolderBase {
    public final x2 f38869a;

    public w2(x2 x2Var) {
        this.f38869a = x2Var;
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
            x2 x2Var = this.f38869a;
            x2Var.f39805n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = x2Var.L;
            if (pageblockvideo != null) {
                p70 p70Var = x2Var.f39801a;
                a0.i iVar = p70Var.f36429y;
                long j3 = pageblockvideo.video_id;
                y2 a2 = y2.a(p70Var.f36427w, x2Var);
                x2Var.c(a2);
                iVar.k(a2, j3);
            }
        }
    }
}
