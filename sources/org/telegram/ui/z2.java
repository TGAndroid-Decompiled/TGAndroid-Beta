package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class z2 extends VideoPlayerHolderBase {
    public final a3 f45011a;

    public z2(a3 a3Var) {
        this.f45011a = a3Var;
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
            a3 a3Var = this.f45011a;
            a3Var.f36350n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = a3Var.H;
            if (pageblockvideo != null) {
                a70 a70Var = a3Var.f36345a;
                a0.h hVar = a70Var.f36383y;
                long j10 = pageblockvideo.video_id;
                b3 a2 = b3.a(a70Var.f36381w, a3Var);
                a3Var.c(a2);
                hVar.k(a2, j10);
            }
        }
    }
}
