package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class u2 extends VideoPlayerHolderBase {
    public final v2 f51721a;

    public u2(v2 v2Var) {
        this.f51721a = v2Var;
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
            v2 v2Var = this.f51721a;
            v2Var.f52103n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = v2Var.M;
            if (pageblockvideo != null) {
                n50 n50Var = v2Var.f52098a;
                a0.h hVar = n50Var.E;
                long j3 = pageblockvideo.video_id;
                w2 a10 = w2.a(n50Var.f49457x, v2Var);
                v2Var.c(a10);
                hVar.k(a10, j3);
            }
        }
    }
}
