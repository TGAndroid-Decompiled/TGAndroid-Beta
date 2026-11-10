package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class u2 extends VideoPlayerHolderBase {
    public final v2 f50386a;

    public u2(v2 v2Var) {
        this.f50386a = v2Var;
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
            v2 v2Var = this.f50386a;
            v2Var.f50621n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = v2Var.L;
            if (pageblockvideo != null) {
                r50 r50Var = v2Var.f50616a;
                a0.h hVar = r50Var.D;
                long j3 = pageblockvideo.video_id;
                w2 a10 = w2.a(r50Var.f49258x, v2Var);
                v2Var.c(a10);
                hVar.k(a10, j3);
            }
        }
    }
}
