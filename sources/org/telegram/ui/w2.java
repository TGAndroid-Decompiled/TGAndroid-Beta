package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class w2 extends VideoPlayerHolderBase {
    public final x2 f41896a;

    public w2(x2 x2Var) {
        this.f41896a = x2Var;
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
            x2 x2Var = this.f41896a;
            x2Var.f42789n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = x2Var.L;
            if (pageblockvideo != null) {
                t70 t70Var = x2Var.f42784a;
                a0.i iVar = t70Var.f40737y;
                long j3 = pageblockvideo.video_id;
                y2 a2 = y2.a(t70Var.f40735w, x2Var);
                x2Var.c(a2);
                iVar.k(a2, j3);
            }
        }
    }
}
