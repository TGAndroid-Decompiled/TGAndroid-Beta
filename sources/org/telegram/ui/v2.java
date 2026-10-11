package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class v2 extends VideoPlayerHolderBase {
    public final w2 f42859a;

    public v2(w2 w2Var) {
        this.f42859a = w2Var;
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
            w2 w2Var = this.f42859a;
            w2Var.f43180n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = w2Var.L;
            if (pageblockvideo != null) {
                t70 t70Var = w2Var.f43175a;
                a0.i iVar = t70Var.f42106y;
                long j3 = pageblockvideo.video_id;
                x2 a2 = x2.a(t70Var.f42104w, w2Var);
                w2Var.c(a2);
                iVar.k(a2, j3);
            }
        }
    }
}
