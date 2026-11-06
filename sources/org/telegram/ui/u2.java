package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class u2 extends VideoPlayerHolderBase {
    public final v2 f50203a;

    public u2(v2 v2Var) {
        this.f50203a = v2Var;
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
            v2 v2Var = this.f50203a;
            v2Var.f50560n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = v2Var.L;
            if (pageblockvideo != null) {
                o50 o50Var = v2Var.f50555a;
                a0.h hVar = o50Var.D;
                long j3 = pageblockvideo.video_id;
                w2 a10 = w2.a(o50Var.f48275x, v2Var);
                v2Var.c(a10);
                hVar.k(a10, j3);
            }
        }
    }
}
