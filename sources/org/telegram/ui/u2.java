package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class u2 extends VideoPlayerHolderBase {
    public final v2 f41770a;

    public u2(v2 v2Var) {
        this.f41770a = v2Var;
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
            v2 v2Var = this.f41770a;
            v2Var.f42391n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = v2Var.L;
            if (pageblockvideo != null) {
                l60 l60Var = v2Var.f42387a;
                a0.h hVar = l60Var.D;
                long j10 = pageblockvideo.video_id;
                w2 a2 = w2.a(l60Var.f39103x, v2Var);
                v2Var.c(a2);
                hVar.k(a2, j10);
            }
        }
    }
}
