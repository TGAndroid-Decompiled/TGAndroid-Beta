package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class v2 extends VideoPlayerHolderBase {
    public final w2 f50367a;

    public v2(w2 w2Var) {
        this.f50367a = w2Var;
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
            w2 w2Var = this.f50367a;
            w2Var.f50673n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = w2Var.M;
            if (pageblockvideo != null) {
                i50 i50Var = w2Var.f50668a;
                a0.h hVar = i50Var.E;
                long j10 = pageblockvideo.video_id;
                x2 a10 = x2.a(i50Var.f46119x, w2Var);
                w2Var.c(a10);
                hVar.k(a10, j10);
            }
        }
    }
}
