package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class u2 extends VideoPlayerHolderBase {
    public final v2 f50280a;

    public u2(v2 v2Var) {
        this.f50280a = v2Var;
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
            v2 v2Var = this.f50280a;
            v2Var.f50551n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = v2Var.L;
            if (pageblockvideo != null) {
                q50 q50Var = v2Var.f50546a;
                a0.h hVar = q50Var.D;
                long j3 = pageblockvideo.video_id;
                w2 a10 = w2.a(q50Var.f48926x, v2Var);
                v2Var.c(a10);
                hVar.k(a10, j3);
            }
        }
    }
}
