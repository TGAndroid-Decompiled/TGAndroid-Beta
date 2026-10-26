package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class v2 extends VideoPlayerHolderBase {
    public final w2 f44575a;

    public v2(w2 w2Var) {
        this.f44575a = w2Var;
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
            w2 w2Var = this.f44575a;
            w2Var.f44952n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = w2Var.L;
            if (pageblockvideo != null) {
                h70 h70Var = w2Var.f44948a;
                a0.h hVar = h70Var.f39928y;
                long j10 = pageblockvideo.video_id;
                x2 a2 = x2.a(h70Var.f39926w, w2Var);
                w2Var.c(a2);
                hVar.k(a2, j10);
            }
        }
    }
}
