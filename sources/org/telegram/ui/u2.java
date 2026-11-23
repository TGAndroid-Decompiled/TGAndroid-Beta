package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class u2 extends VideoPlayerHolderBase {
    public final v2 f52419a;

    public u2(v2 v2Var) {
        this.f52419a = v2Var;
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
            v2 v2Var = this.f52419a;
            v2Var.f52688n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = v2Var.M;
            if (pageblockvideo != null) {
                p50 p50Var = v2Var.f52683a;
                a0.h hVar = p50Var.E;
                long j3 = pageblockvideo.video_id;
                w2 a10 = w2.a(p50Var.f50733x, v2Var);
                v2Var.c(a10);
                hVar.k(a10, j3);
            }
        }
    }
}
