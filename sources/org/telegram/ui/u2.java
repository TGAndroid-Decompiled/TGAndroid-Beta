package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class u2 extends VideoPlayerHolderBase {
    public final v2 f41991a;

    public u2(v2 v2Var) {
        this.f41991a = v2Var;
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
            v2 v2Var = this.f41991a;
            v2Var.f42576n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = v2Var.L;
            if (pageblockvideo != null) {
                m60 m60Var = v2Var.f42572a;
                a0.h hVar = m60Var.D;
                long j10 = pageblockvideo.video_id;
                w2 a2 = w2.a(m60Var.f39488x, v2Var);
                v2Var.c(a2);
                hVar.k(a2, j10);
            }
        }
    }
}
